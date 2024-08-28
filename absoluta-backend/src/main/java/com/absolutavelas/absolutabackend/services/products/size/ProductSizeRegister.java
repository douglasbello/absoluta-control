package com.absolutavelas.absolutabackend.services.products.size;

import com.absolutavelas.absolutabackend.dtos.products.size.ProductSizeRequest;

import java.util.UUID;

public interface ProductSizeRegister {
    UUID register(ProductSizeRequest request);
}