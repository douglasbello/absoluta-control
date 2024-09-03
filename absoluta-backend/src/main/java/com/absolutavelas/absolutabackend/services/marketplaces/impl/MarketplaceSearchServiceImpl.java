package com.absolutavelas.absolutabackend.services.marketplaces.impl;

import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import com.absolutavelas.absolutabackend.database.repositories.marketplaces.MarketplaceRepository;
import com.absolutavelas.absolutabackend.handlers.exceptions.ResourceNotFoundException;
import com.absolutavelas.absolutabackend.services.marketplaces.MarketplaceSearchService;
import com.absolutavelas.absolutabackend.services.marketplaces.types.MarketplaceTypeSearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MarketplaceSearchServiceImpl implements MarketplaceSearchService {
    private final MarketplaceRepository marketplaceRepository;
    private final MarketplaceTypeSearchService marketplaceTypeSearch;

    public MarketplaceSearchServiceImpl(MarketplaceRepository marketplaceRepository, MarketplaceTypeSearchService marketplaceTypeSearchService) {
        this.marketplaceRepository = marketplaceRepository;
        this.marketplaceTypeSearch = marketplaceTypeSearchService;
    }

    @Override
    public Marketplace findByIdentifier(UUID identifier) {
        return marketplaceRepository.findById(identifier).orElseThrow(() -> new ResourceNotFoundException("Marketplace", identifier));
    }

    @Override
    public Page<Marketplace> findByName(String name, Pageable pageable) {
        return marketplaceRepository.findByName(name, pageable);
    }

    @Override
    public Page<Marketplace> findByType(UUID typeIdentifier, Pageable pageable) {
        marketplaceTypeSearch.findByIdentifier(typeIdentifier);

        return marketplaceRepository.findByType(typeIdentifier, pageable);
    }
}