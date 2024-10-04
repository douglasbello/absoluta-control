package br.com.absolutavelas.control_api.controllers.register.products;

import br.com.absolutavelas.control_api.database.models.ProductCategory;
import br.com.absolutavelas.control_api.dtos.products.ProductCategoryRequest;
import org.springframework.http.ResponseEntity;

public interface ProductCategoryRegisterController {
    ResponseEntity<ProductCategory> register(ProductCategoryRequest request);
}