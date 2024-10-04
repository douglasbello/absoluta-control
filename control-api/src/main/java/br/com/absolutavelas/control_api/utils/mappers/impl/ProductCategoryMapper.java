package br.com.absolutavelas.control_api.utils.mappers.impl;

import br.com.absolutavelas.control_api.database.models.ProductCategory;
import br.com.absolutavelas.control_api.dtos.products.ProductCategoryRequest;
import br.com.absolutavelas.control_api.utils.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class ProductCategoryMapper implements Mapper<ProductCategory, ProductCategoryRequest> {
    @Override
    public ProductCategory requestToEntity(ProductCategoryRequest request) {
        return new ProductCategory(request.name());
    }
}