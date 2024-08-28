package com.absolutavelas.absolutabackend.services.marketplaces.types.impl;

import com.absolutavelas.absolutabackend.database.models.marketplaces.MarketplaceType;
import com.absolutavelas.absolutabackend.database.repositories.MarketplaceTypeRepository;
import com.absolutavelas.absolutabackend.services.marketplaces.types.MarketplaceTypeSearch;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketplaceTypeSearchImpl implements MarketplaceTypeSearch {
    private final MarketplaceTypeRepository marketplaceTypeRepository;

    public MarketplaceTypeSearchImpl(MarketplaceTypeRepository marketplaceTypeRepository) {
        this.marketplaceTypeRepository = marketplaceTypeRepository;
    }

    @Override
    public List<MarketplaceType> findAll() {
        return marketplaceTypeRepository.findAll();
    }

    @Override
    public List<MarketplaceType> findByTypeName(String type) {
        return marketplaceTypeRepository.findAllByTypeName(type);
    }
}