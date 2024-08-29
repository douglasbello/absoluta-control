package com.absolutavelas.absolutabackend.controllers.products.size.impl;

import com.absolutavelas.absolutabackend.controllers.products.size.ProductSizeRegisterController;
import com.absolutavelas.absolutabackend.database.models.products.ProductSize;
import com.absolutavelas.absolutabackend.dtos.products.size.ProductSizeRequest;
import com.absolutavelas.absolutabackend.services.products.size.ProductSizeRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/products/size")
public class ProductSizeRegisterControllerImpl implements ProductSizeRegisterController {
    private final ProductSizeRegisterService productSizeRegisterService;

    public ProductSizeRegisterControllerImpl(ProductSizeRegisterService productSizeRegisterService) {
        this.productSizeRegisterService = productSizeRegisterService;
    }

    @PostMapping
    public ResponseEntity<ProductSize> register(@RequestBody ProductSizeRequest request) {
        ProductSize size = productSizeRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{identifier}").buildAndExpand(size.getIdentifier()).toUri();

        return ResponseEntity.created(uri).body(size);
    }
}