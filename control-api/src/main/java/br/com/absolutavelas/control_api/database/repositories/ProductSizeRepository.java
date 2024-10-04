package br.com.absolutavelas.control_api.database.repositories;

import br.com.absolutavelas.control_api.database.models.ProductSize;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductSizeRepository extends JpaRepository<ProductSize, Integer> {
}