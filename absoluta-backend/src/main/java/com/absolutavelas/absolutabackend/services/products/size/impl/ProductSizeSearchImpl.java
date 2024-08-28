package com.absolutavelas.absolutabackend.services.products.size.impl;

import com.absolutavelas.absolutabackend.database.models.products.ProductSize;
import com.absolutavelas.absolutabackend.database.repositories.products.ProductSizeRepository;
import com.absolutavelas.absolutabackend.handlers.exceptions.ResourceNotFoundException;
import com.absolutavelas.absolutabackend.services.products.size.ProductSizeSearch;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductSizeSearchImpl implements ProductSizeSearch {
    private final ProductSizeRepository productSizeRepository;

    public ProductSizeSearchImpl(ProductSizeRepository productSizeRepository) {
        this.productSizeRepository = productSizeRepository;
    }

    @Override
    public ProductSize findByIdentifier(UUID identifier) {
        return productSizeRepository.findById(identifier).orElseThrow(() -> new ResourceNotFoundException("Product size", identifier));
    }

    @Override
    public List<ProductSize> findAll() {
        return productSizeRepository.findAll();
    }
}