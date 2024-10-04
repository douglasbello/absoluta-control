package br.com.absolutavelas.control_api.services.products.search.products;

import br.com.absolutavelas.control_api.database.models.Product;

public interface ProductSearchService {
    Product findById(Integer id);
}