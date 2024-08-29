package com.absolutavelas.absolutabackend.controllers.products.size;

import com.absolutavelas.absolutabackend.database.models.products.ProductSize;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface ProductSizeSearchController {
    ResponseEntity<ProductSize> findByIdentifier(UUID identifier);
    ResponseEntity<List<ProductSize>> findAll();
}