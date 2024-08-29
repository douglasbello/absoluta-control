package com.absolutavelas.absolutabackend.controllers.marketplaces.types;

import com.absolutavelas.absolutabackend.database.models.marketplaces.MarketplaceType;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface MarketplaceTypeSearchController {
    ResponseEntity<MarketplaceType> findByIdentifier(UUID identifier);
    ResponseEntity<List<MarketplaceType>> findAll();
    ResponseEntity<List<MarketplaceType>> findByTypeName(String type);
}