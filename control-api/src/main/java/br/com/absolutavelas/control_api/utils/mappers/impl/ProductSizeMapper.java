package br.com.absolutavelas.control_api.utils.mappers.impl;

import br.com.absolutavelas.control_api.database.models.ProductSize;
import br.com.absolutavelas.control_api.dtos.products.ProductSizeRequest;
import br.com.absolutavelas.control_api.utils.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class ProductSizeMapper implements Mapper<ProductSize, ProductSizeRequest> {
    @Override
    public ProductSize requestToEntity(ProductSizeRequest request) {
        return new ProductSize(request.name());
    }
}