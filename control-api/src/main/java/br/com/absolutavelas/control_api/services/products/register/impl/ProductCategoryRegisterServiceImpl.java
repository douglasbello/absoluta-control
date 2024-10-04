package br.com.absolutavelas.control_api.services.products.register.impl;

import br.com.absolutavelas.control_api.database.models.ProductCategory;
import br.com.absolutavelas.control_api.database.repositories.ProductCategoryRepository;
import br.com.absolutavelas.control_api.dtos.products.ProductCategoryRequest;
import br.com.absolutavelas.control_api.services.products.register.ProductCategoryRegisterService;
import br.com.absolutavelas.control_api.utils.mappers.impl.ProductCategoryMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryRegisterServiceImpl implements ProductCategoryRegisterService {
    private final ProductCategoryRepository productCategoryRepository;
    private final ProductCategoryMapper productCategoryMapper;

    public ProductCategoryRegisterServiceImpl(ProductCategoryRepository productCategoryRepository, ProductCategoryMapper productCategoryMapper) {
        this.productCategoryRepository = productCategoryRepository;
        this.productCategoryMapper = productCategoryMapper;
    }

    @Override
    public ProductCategory register(ProductCategoryRequest request) {
        return productCategoryRepository.save(productCategoryMapper.requestToEntity(request));
    }
}