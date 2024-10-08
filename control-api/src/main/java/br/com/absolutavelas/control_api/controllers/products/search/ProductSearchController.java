package br.com.absolutavelas.control_api.controllers.products.search;

import br.com.absolutavelas.control_api.database.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface ProductSearchController {
    ResponseEntity<Product> findById(Integer id);
    ResponseEntity<Page<Product>> findAll(Pageable pageable);
}