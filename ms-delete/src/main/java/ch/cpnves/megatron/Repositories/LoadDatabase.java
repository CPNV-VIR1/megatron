package ch.cpnves.megatron.Repositories;

import ch.cpnves.megatron.Entities.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ProductRepository repository){
        return args->{
            log.info("Preloading " + repository.save(new Product("Optimum Prideo", Double.parseDouble("20.32"))));
        };
    }
}
