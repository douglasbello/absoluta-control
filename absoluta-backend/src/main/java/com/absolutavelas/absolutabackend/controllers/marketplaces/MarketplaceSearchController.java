package com.absolutavelas.absolutabackend.controllers.marketplaces;

import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface MarketplaceSearchController {
    ResponseEntity<Marketplace> findByIdentifier(UUID identifier);
    ResponseEntity<Page<Marketplace>> findByName(String name, Pageable pageable);
    ResponseEntity<List<Marketplace>> findByType(UUID typeIdentifier);
}