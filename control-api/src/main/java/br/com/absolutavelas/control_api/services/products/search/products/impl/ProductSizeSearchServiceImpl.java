package br.com.absolutavelas.control_api.services.products.search.products.impl;

import br.com.absolutavelas.control_api.database.models.ProductSize;
import br.com.absolutavelas.control_api.database.repositories.ProductSizeRepository;
import br.com.absolutavelas.control_api.handlers.exceptions.NotFoundException;
import br.com.absolutavelas.control_api.services.products.search.products.ProductSizeSearchService;
import org.springframework.stereotype.Service;

@Service
public class ProductSizeSearchServiceImpl implements ProductSizeSearchService {
    private final ProductSizeRepository productSizeRepository;

    public ProductSizeSearchServiceImpl(ProductSizeRepository productSizeRepository) {
        this.productSizeRepository = productSizeRepository;
    }

    @Override
    public ProductSize findById(Integer id) {
        return productSizeRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }
}