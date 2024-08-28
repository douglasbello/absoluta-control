package com.absolutavelas.absolutabackend.services.marketplaces.types;

import com.absolutavelas.absolutabackend.database.models.products.MarketplaceType;

import java.util.List;

public interface MarketplaceTypeSearch {
    List<MarketplaceType> findAll();
    List<MarketplaceType> findByTypeName(String type);
}