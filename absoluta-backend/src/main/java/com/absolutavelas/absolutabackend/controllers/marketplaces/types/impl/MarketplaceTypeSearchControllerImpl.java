package com.absolutavelas.absolutabackend.controllers.marketplaces.types.impl;

import com.absolutavelas.absolutabackend.controllers.marketplaces.types.MarketplaceTypeSearchController;
import com.absolutavelas.absolutabackend.database.models.marketplaces.MarketplaceType;
import com.absolutavelas.absolutabackend.services.marketplaces.types.MarketplaceTypeSearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/marketplaces/types")
public class MarketplaceTypeSearchControllerImpl implements MarketplaceTypeSearchController {
    private final MarketplaceTypeSearchService marketplaceTypeSearchService;

    public MarketplaceTypeSearchControllerImpl(MarketplaceTypeSearchService marketplaceTypeSearchService) {
        this.marketplaceTypeSearchService = marketplaceTypeSearchService;
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<MarketplaceType> findByIdentifier(@PathVariable UUID identifier) {
        return ResponseEntity.ok().body(marketplaceTypeSearchService.findByIdentifier(identifier));
    }

    @GetMapping
    public ResponseEntity<List<MarketplaceType>> findAll() {
        return ResponseEntity.ok().body(marketplaceTypeSearchService.findAll());
    }

    @GetMapping("/name/{type}")
    public ResponseEntity<List<MarketplaceType>> findByTypeName(@PathVariable String type) {
        return ResponseEntity.ok().body(marketplaceTypeSearchService.findByTypeName(type));
    }
}