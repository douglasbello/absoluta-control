package br.com.absolutavelas.control_api.controllers.products.register.impl;

import br.com.absolutavelas.control_api.controllers.products.register.ProductCategoryRegisterController;
import br.com.absolutavelas.control_api.database.models.ProductCategory;
import br.com.absolutavelas.control_api.dtos.products.ProductCategoryRequest;
import br.com.absolutavelas.control_api.services.products.register.ProductCategoryRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/products/categories")
public class ProductCategoryRegisterControllerImpl implements ProductCategoryRegisterController {
    private final ProductCategoryRegisterService productCategoryRegisterService;

    public ProductCategoryRegisterControllerImpl(ProductCategoryRegisterService productCategoryRegisterService) {
        this.productCategoryRegisterService = productCategoryRegisterService;
    }

    @PostMapping
    public ResponseEntity<ProductCategory> register(@RequestBody ProductCategoryRequest request) {
        ProductCategory created = productCategoryRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(created.getId()).toUri();

        return ResponseEntity.created(uri).body(created);
    }
}