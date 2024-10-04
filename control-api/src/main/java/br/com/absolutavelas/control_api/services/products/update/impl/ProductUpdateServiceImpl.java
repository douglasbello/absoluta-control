package br.com.absolutavelas.control_api.services.products.update.impl;

import br.com.absolutavelas.control_api.database.models.Product;
import br.com.absolutavelas.control_api.database.repositories.ProductRepository;
import br.com.absolutavelas.control_api.services.products.search.products.ProductSearchService;
import br.com.absolutavelas.control_api.services.products.update.ProductUpdateService;
import org.springframework.stereotype.Service;

@Service
public class ProductUpdateServiceImpl implements ProductUpdateService {
    private final ProductRepository productRepository;
    private final ProductSearchService productSearchService;

    public ProductUpdateServiceImpl(ProductRepository productRepository, ProductSearchService productSearchService) {
        this.productRepository = productRepository;
        this.productSearchService = productSearchService;
    }

    @Override
    public void update(Product update) {
        Product old = productSearchService.findById(update.getId());
        updateData(old, update);
        productRepository.save(old);
    }

    private void updateData(Product old, Product update) {
        old.setSize(update.getSize());
        old.setFlavour(update.getFlavour());
        old.setCategory(update.getCategory());
        old.setName(update.getName());
        old.setDescription(update.getDescription());
        old.setActive(update.isActive());
        old.setPrice(update.getPrice());
    }
}