package br.com.absolutavelas.control_api.utils.mappers.impl;

import br.com.absolutavelas.control_api.database.models.Product;
import br.com.absolutavelas.control_api.dtos.products.ProductRequest;
import br.com.absolutavelas.control_api.utils.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements Mapper<Product, ProductRequest> {
    @Override
    public Product requestToEntity(ProductRequest request) {
        return new Product(
                request.name(),
                request.price(),
                request.description(),
                true,
                request.stockAmount()
        );
    }
}