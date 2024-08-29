package com.absolutavelas.absolutabackend.services.products.size;

import com.absolutavelas.absolutabackend.database.models.products.ProductSize;

import java.util.List;
import java.util.UUID;

public interface ProductSizeSearchService {
    ProductSize findByIdentifier(UUID identifier);
    List<ProductSize> findAll();
}