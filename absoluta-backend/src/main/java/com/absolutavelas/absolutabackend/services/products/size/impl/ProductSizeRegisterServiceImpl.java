package com.absolutavelas.absolutabackend.services.products.size.impl;

import com.absolutavelas.absolutabackend.database.models.products.ProductSize;
import com.absolutavelas.absolutabackend.database.repositories.products.ProductSizeRepository;
import com.absolutavelas.absolutabackend.dtos.products.size.ProductSizeRequest;
import com.absolutavelas.absolutabackend.services.products.size.ProductSizeRegisterService;
import org.springframework.stereotype.Service;

@Service
public class ProductSizeRegisterServiceImpl implements ProductSizeRegisterService {
    private final ProductSizeRepository productSizeRepository;

    public ProductSizeRegisterServiceImpl(ProductSizeRepository productSizeRepository) {
        this.productSizeRepository = productSizeRepository;
    }

    @Override
    public ProductSize register(ProductSizeRequest request) {
        ProductSize size = new ProductSize(request.size());

        return productSizeRepository.save(size);
    }
}