package com.absolutavelas.absolutabackend.controllers.marketplaces.impl;

import com.absolutavelas.absolutabackend.controllers.marketplaces.MarketplaceSearchController;
import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import com.absolutavelas.absolutabackend.services.marketplaces.MarketplaceSearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/marketplace")
public class MarketplaceSearchControllerImpl implements MarketplaceSearchController {
    private final MarketplaceSearchService marketplaceSearchService;

    public MarketplaceSearchControllerImpl(MarketplaceSearchService marketplaceSearchService) {
        this.marketplaceSearchService = marketplaceSearchService;
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<Marketplace> findByIdentifier(@PathVariable UUID identifier) {
        return ResponseEntity.ok().body(marketplaceSearchService.findByIdentifier(identifier));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Page<Marketplace>> findByName(@PathVariable String name, Pageable pageable) {
        return ResponseEntity.ok().body(marketplaceSearchService.findByName(name, pageable));
    }

    @GetMapping("/type/{typeIdentifier}")
    public ResponseEntity<List<Marketplace>> findByType(@PathVariable UUID typeIdentifier) {
        return ResponseEntity.ok().body(marketplaceSearchService.findByType(typeIdentifier));
    }
}