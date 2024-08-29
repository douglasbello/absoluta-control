package com.absolutavelas.absolutabackend.services.marketplaces.types;

import com.absolutavelas.absolutabackend.database.models.marketplaces.MarketplaceType;

import java.util.List;
import java.util.UUID;

public interface MarketplaceTypeSearchService {
    MarketplaceType findByIdentifier(UUID identifier);
    List<MarketplaceType> findAll();
    List<MarketplaceType> findByTypeName(String type);
}