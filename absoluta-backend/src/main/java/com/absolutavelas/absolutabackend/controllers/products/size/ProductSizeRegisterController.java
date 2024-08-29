package com.absolutavelas.absolutabackend.controllers.products.size;

import com.absolutavelas.absolutabackend.database.models.products.ProductSize;
import com.absolutavelas.absolutabackend.dtos.products.size.ProductSizeRequest;
import org.springframework.http.ResponseEntity;

public interface ProductSizeRegisterController {
    ResponseEntity<ProductSize> register(ProductSizeRequest request);
}