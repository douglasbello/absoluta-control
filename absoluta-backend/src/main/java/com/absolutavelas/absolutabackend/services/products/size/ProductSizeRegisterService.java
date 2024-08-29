package com.absolutavelas.absolutabackend.services.products.size;

import com.absolutavelas.absolutabackend.database.models.products.ProductSize;
import com.absolutavelas.absolutabackend.dtos.products.size.ProductSizeRequest;

public interface ProductSizeRegisterService {
    ProductSize register(ProductSizeRequest request);
}