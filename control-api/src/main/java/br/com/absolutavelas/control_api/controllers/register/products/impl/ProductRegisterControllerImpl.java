package br.com.absolutavelas.control_api.controllers.register.products.impl;

import br.com.absolutavelas.control_api.controllers.register.products.ProductRegisterController;
import br.com.absolutavelas.control_api.database.models.Product;
import br.com.absolutavelas.control_api.dtos.products.ProductRequest;
import br.com.absolutavelas.control_api.services.products.register.ProductRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductRegisterControllerImpl implements ProductRegisterController {
    private final ProductRegisterService productRegisterService;

    public ProductRegisterControllerImpl(ProductRegisterService productRegisterService) {
        this.productRegisterService = productRegisterService;
    }

    @PostMapping
    public ResponseEntity<Product> register(ProductRequest request) {
        return ResponseEntity.ok().body(productRegisterService.register(request));
    }
}