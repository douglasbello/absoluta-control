package br.com.absolutavelas.control_api.services.products.register.impl;

import br.com.absolutavelas.control_api.database.models.ProductCategory;
import br.com.absolutavelas.control_api.database.repositories.ProductCategoryRepository;
import br.com.absolutavelas.control_api.services.products.register.ProductCategoryRegisterService;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryRegisterServiceImpl implements ProductCategoryRegisterService {
    private final ProductCategoryRepository productCategoryRepository;

    public ProductCategoryRegisterServiceImpl(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    @Override
    public ProductCategory register(ProductCategory category) {
        return productCategoryRepository.save(category);
    }
}