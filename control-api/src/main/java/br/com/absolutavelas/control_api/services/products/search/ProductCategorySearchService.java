package br.com.absolutavelas.control_api.services.products.search;

import br.com.absolutavelas.control_api.database.models.ProductCategory;

public interface ProductCategorySearchService {
    ProductCategory findById(Integer id);
}