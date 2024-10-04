package br.com.absolutavelas.control_api.database.repositories;

import br.com.absolutavelas.control_api.database.models.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
}