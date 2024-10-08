package br.com.absolutavelas.control_api.controllers.products.search.impl;

import br.com.absolutavelas.control_api.controllers.products.search.ProductSearchController;
import br.com.absolutavelas.control_api.database.models.Product;
import br.com.absolutavelas.control_api.services.products.search.products.ProductSearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductSearchControllerImpl implements ProductSearchController {
    private final ProductSearchService productSearchService;

    public ProductSearchControllerImpl(ProductSearchService productSearchService) {
        this.productSearchService = productSearchService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(productSearchService.findById(id));
    }

    @GetMapping
    public ResponseEntity<Page<Product>> findAll(@PageableDefault(size = 12) Pageable pageable) {
        return ResponseEntity.ok().body(productSearchService.findAll(pageable));
    }
}