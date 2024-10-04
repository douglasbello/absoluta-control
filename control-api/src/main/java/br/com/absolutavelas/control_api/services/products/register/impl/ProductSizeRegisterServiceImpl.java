package br.com.absolutavelas.control_api.services.products.register.impl;

import br.com.absolutavelas.control_api.database.models.ProductSize;
import br.com.absolutavelas.control_api.database.repositories.ProductSizeRepository;
import br.com.absolutavelas.control_api.services.products.register.ProductSizeRegisterService;
import org.springframework.stereotype.Service;

@Service
public class ProductSizeRegisterServiceImpl implements ProductSizeRegisterService {
    private final ProductSizeRepository productSizeRepository;

    public ProductSizeRegisterServiceImpl(ProductSizeRepository productSizeRepository) {
        this.productSizeRepository = productSizeRepository;
    }

    @Override
    public ProductSize register(ProductSize size) {
        return productSizeRepository.save(size);
    }
}