package com.absolutavelas.absolutabackend.controllers.products.size.impl;

import com.absolutavelas.absolutabackend.controllers.products.size.ProductSizeSearchController;
import com.absolutavelas.absolutabackend.database.models.products.ProductSize;
import com.absolutavelas.absolutabackend.services.products.size.ProductSizeSearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products/size")
public class ProductSizeSearchControllerImpl implements ProductSizeSearchController {
    private final ProductSizeSearchService productSizeSearchService;

    public ProductSizeSearchControllerImpl(ProductSizeSearchService productSizeSearchService) {
        this.productSizeSearchService = productSizeSearchService;
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<ProductSize> findByIdentifier(@PathVariable UUID identifier) {
        return ResponseEntity.ok().body(productSizeSearchService.findByIdentifier(identifier));
    }

    @GetMapping
    public ResponseEntity<List<ProductSize>> findAll() {
        return ResponseEntity.ok().body(productSizeSearchService.findAll());
    }
}