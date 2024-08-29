package com.absolutavelas.absolutabackend.services.marketplaces.types.impl;

import com.absolutavelas.absolutabackend.database.models.marketplaces.MarketplaceType;
import com.absolutavelas.absolutabackend.database.repositories.marketplaces.MarketplaceTypeRepository;
import com.absolutavelas.absolutabackend.handlers.exceptions.ResourceNotFoundException;
import com.absolutavelas.absolutabackend.services.marketplaces.types.MarketplaceTypeSearchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MarketplaceTypeSearchServiceImpl implements MarketplaceTypeSearchService {
    private final MarketplaceTypeRepository marketplaceTypeRepository;

    public MarketplaceTypeSearchServiceImpl(MarketplaceTypeRepository marketplaceTypeRepository) {
        this.marketplaceTypeRepository = marketplaceTypeRepository;
    }

    @Override
    public MarketplaceType findByIdentifier(UUID identifier) {
        return marketplaceTypeRepository.findById(identifier).orElseThrow(() -> new ResourceNotFoundException("MarketplaceType", identifier));
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