package ch.cpnves.megatron.Repositories;

import ch.cpnves.megatron.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}