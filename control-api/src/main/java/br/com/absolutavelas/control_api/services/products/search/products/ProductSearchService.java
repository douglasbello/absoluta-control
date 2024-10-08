package br.com.absolutavelas.control_api.services.products.search.products;

import br.com.absolutavelas.control_api.database.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductSearchService {
    Product findById(Integer id);
    Page<Product> findAll(Pageable pageable);
}