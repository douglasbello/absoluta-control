package br.com.absolutavelas.control_api.services.products.register;

import br.com.absolutavelas.control_api.database.models.ProductCategory;
import br.com.absolutavelas.control_api.dtos.products.ProductCategoryRequest;

public interface ProductCategoryRegisterService {
    ProductCategory register(ProductCategoryRequest request);
}