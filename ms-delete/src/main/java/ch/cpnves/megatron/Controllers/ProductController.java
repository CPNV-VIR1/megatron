package ch.cpnves.megatron.Controllers;

import ch.cpnves.megatron.Entities.Product;
import ch.cpnves.megatron.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
}