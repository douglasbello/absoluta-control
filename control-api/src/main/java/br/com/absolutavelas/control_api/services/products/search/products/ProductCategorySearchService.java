package br.com.absolutavelas.control_api.services.products.search.products;

import br.com.absolutavelas.control_api.database.models.ProductCategory;

public interface ProductCategorySearchService {
    ProductCategory findById(Integer id);
}