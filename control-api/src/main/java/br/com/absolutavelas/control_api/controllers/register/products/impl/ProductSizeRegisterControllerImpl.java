package br.com.absolutavelas.control_api.controllers.register.products.impl;

import br.com.absolutavelas.control_api.controllers.register.products.ProductSizeRegisterController;
import br.com.absolutavelas.control_api.database.models.ProductSize;
import br.com.absolutavelas.control_api.dtos.products.ProductSizeRequest;
import br.com.absolutavelas.control_api.services.products.register.ProductSizeRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/size")
public class ProductSizeRegisterControllerImpl implements ProductSizeRegisterController {
    private final ProductSizeRegisterService productSizeRegisterService;

    public ProductSizeRegisterControllerImpl(ProductSizeRegisterService productSizeRegisterService) {
        this.productSizeRegisterService = productSizeRegisterService;
    }

    @PostMapping
    public ResponseEntity<ProductSize> register(@RequestBody ProductSizeRequest request) {
        return ResponseEntity.ok().body(productSizeRegisterService.register(request));
    }
}