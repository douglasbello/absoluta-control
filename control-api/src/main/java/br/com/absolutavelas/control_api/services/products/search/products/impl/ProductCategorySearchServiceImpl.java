package br.com.absolutavelas.control_api.services.products.search.products.impl;

import br.com.absolutavelas.control_api.database.models.ProductCategory;
import br.com.absolutavelas.control_api.database.repositories.ProductCategoryRepository;
import br.com.absolutavelas.control_api.handlers.exceptions.NotFoundException;
import br.com.absolutavelas.control_api.services.products.search.products.ProductCategorySearchService;
import org.springframework.stereotype.Service;

@Service
public class ProductCategorySearchServiceImpl implements ProductCategorySearchService {
    private final ProductCategoryRepository productCategoryRepository;

    public ProductCategorySearchServiceImpl(ProductCategoryRepository productCategoryRepository) {
        this.productCategoryRepository = productCategoryRepository;
    }

    @Override
    public ProductCategory findById(Integer id) {
        return productCategoryRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }
}