package br.com.absolutavelas.control_api.database.repositories;

import br.com.absolutavelas.control_api.database.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}