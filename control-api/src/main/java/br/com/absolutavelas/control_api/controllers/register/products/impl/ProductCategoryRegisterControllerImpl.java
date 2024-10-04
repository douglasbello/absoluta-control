package br.com.absolutavelas.control_api.controllers.register.products.impl;

import br.com.absolutavelas.control_api.controllers.register.products.ProductCategoryRegisterController;
import br.com.absolutavelas.control_api.database.models.ProductCategory;
import br.com.absolutavelas.control_api.dtos.products.ProductCategoryRequest;
import br.com.absolutavelas.control_api.services.products.register.ProductCategoryRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/categories")
public class ProductCategoryRegisterControllerImpl implements ProductCategoryRegisterController {
    private final ProductCategoryRegisterService productCategoryRegisterService;

    public ProductCategoryRegisterControllerImpl(ProductCategoryRegisterService productCategoryRegisterService) {
        this.productCategoryRegisterService = productCategoryRegisterService;
    }

    @PostMapping
    public ResponseEntity<ProductCategory> register(ProductCategoryRequest request) {
        return ResponseEntity.ok().body(productCategoryRegisterService.register(request));
    }
}