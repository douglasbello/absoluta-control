package com.absolutavelas.absolutabackend.services.marketplaces;

import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface MarketplaceSearchService {
    Marketplace findByIdentifier(UUID identifier);
    Page<Marketplace> findByName(String name, Pageable pageable);
    Page<Marketplace> findByType(UUID typeIdentifier, Pageable pageable);
}