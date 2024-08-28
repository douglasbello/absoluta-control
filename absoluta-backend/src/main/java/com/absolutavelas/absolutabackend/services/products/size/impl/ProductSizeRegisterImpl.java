package com.absolutavelas.absolutabackend.services.products.size.impl;

import com.absolutavelas.absolutabackend.database.models.products.ProductSize;
import com.absolutavelas.absolutabackend.database.repositories.products.ProductSizeRepository;
import com.absolutavelas.absolutabackend.dtos.products.size.ProductSizeRequest;
import com.absolutavelas.absolutabackend.services.products.size.ProductSizeRegister;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductSizeRegisterImpl implements ProductSizeRegister {
    private final ProductSizeRepository productSizeRepository;

    public ProductSizeRegisterImpl(ProductSizeRepository productSizeRepository) {
        this.productSizeRepository = productSizeRepository;
    }

    @Override
    public UUID register(ProductSizeRequest request) {
        ProductSize size = new ProductSize(request.size());

        size = productSizeRepository.save(size);

        return size.getIdentifier();
    }
}