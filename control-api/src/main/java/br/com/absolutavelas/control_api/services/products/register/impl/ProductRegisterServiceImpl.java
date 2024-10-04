package br.com.absolutavelas.control_api.services.products.register.impl;

import br.com.absolutavelas.control_api.database.models.Flavour;
import br.com.absolutavelas.control_api.database.models.Product;
import br.com.absolutavelas.control_api.database.models.ProductCategory;
import br.com.absolutavelas.control_api.database.models.ProductSize;
import br.com.absolutavelas.control_api.database.repositories.ProductRepository;
import br.com.absolutavelas.control_api.dtos.products.ProductRequest;
import br.com.absolutavelas.control_api.services.products.register.ProductRegisterService;
import br.com.absolutavelas.control_api.services.products.search.FlavourSearchService;
import br.com.absolutavelas.control_api.services.products.search.ProductCategorySearchService;
import br.com.absolutavelas.control_api.services.products.search.ProductSizeSearchService;
import br.com.absolutavelas.control_api.utils.mappers.impl.ProductMapper;
import org.springframework.stereotype.Service;

@Service
public class ProductRegisterServiceImpl implements ProductRegisterService {
    private final ProductRepository productRepository;
    private final FlavourSearchService flavourSearchService;
    private final ProductCategorySearchService productCategorySearchService;
    private final ProductSizeSearchService productSizeSearchService;
    private final ProductMapper productMapper;

    public ProductRegisterServiceImpl(ProductRepository productRepository,
                                      FlavourSearchService flavourSearchService,
                                      ProductCategorySearchService productCategorySearchService,
                                      ProductSizeSearchService productSizeSearchService,
                                      ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.flavourSearchService = flavourSearchService;
        this.productCategorySearchService = productCategorySearchService;
        this.productSizeSearchService = productSizeSearchService;
        this.productMapper = productMapper;
    }

    @Override
    public Product register(ProductRequest dto) {
        Flavour flavour = flavourSearchService.findById(dto.flavourId());
        ProductCategory category = productCategorySearchService.findById(dto.categoryId());
        ProductSize size = productSizeSearchService.findById(dto.sizeId());

        Product product = productMapper.requestToEntity(dto);
        product.setFlavour(flavour);
        product.setCategory(category);
        product.setSize(size);

        return productRepository.save(product);
    }
}