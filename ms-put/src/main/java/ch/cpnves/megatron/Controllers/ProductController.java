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

    @PutMapping("/products/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable Long id) {
        return productRepository.findById(id)
                .map(p -> {
                    p.setName(product.getName());
                    p.setPrice(product.getPrice());
                    return productRepository.save(p);
                })
                .orElseGet(() -> {
                    product.setId(id);
                    return productRepository.save(product);
                });
    }
}