package br.com.absolutavelas.control_api.services.products.search.products;

import br.com.absolutavelas.control_api.database.models.ProductSize;

public interface ProductSizeSearchService {
    ProductSize findById(Integer id);
}