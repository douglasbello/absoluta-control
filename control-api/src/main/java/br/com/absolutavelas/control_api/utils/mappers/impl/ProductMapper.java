package br.com.absolutavelas.control_api.utils.mappers.impl;

import br.com.absolutavelas.control_api.database.models.Product;
import br.com.absolutavelas.control_api.dtos.products.ProductRequestDTO;
import br.com.absolutavelas.control_api.utils.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements Mapper<Product, ProductRequestDTO> {

    @Override
    public Product requestToEntity(ProductRequestDTO request) {
        return new Product(
                request.name(),
                request.price(),
                request.description(),
                true,
                request.stockAmount()
        );
    }
}