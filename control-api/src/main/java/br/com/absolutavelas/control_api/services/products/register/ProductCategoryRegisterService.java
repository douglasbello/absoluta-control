package br.com.absolutavelas.control_api.services.products.register;

import br.com.absolutavelas.control_api.database.models.ProductCategory;

public interface ProductCategoryRegisterService {
    ProductCategory register(ProductCategory category);
}