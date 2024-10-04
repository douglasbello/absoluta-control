package br.com.absolutavelas.control_api.services.products.register.impl;

import br.com.absolutavelas.control_api.database.models.ProductSize;
import br.com.absolutavelas.control_api.database.repositories.ProductSizeRepository;
import br.com.absolutavelas.control_api.dtos.products.ProductSizeRequest;
import br.com.absolutavelas.control_api.services.products.register.ProductSizeRegisterService;
import br.com.absolutavelas.control_api.utils.mappers.impl.ProductSizeMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductSizeRegisterServiceImpl implements ProductSizeRegisterService {
    private final ProductSizeRepository productSizeRepository;
    private final ProductSizeMapper productSizeMapper;

    public ProductSizeRegisterServiceImpl(ProductSizeRepository productSizeRepository, ProductSizeMapper productSizeMapper) {
        this.productSizeRepository = productSizeRepository;
        this.productSizeMapper = productSizeMapper;
    }

    @Override
    public ProductSize register(ProductSizeRequest request) {
        return productSizeRepository.save(productSizeMapper.requestToEntity(request));
    }
}