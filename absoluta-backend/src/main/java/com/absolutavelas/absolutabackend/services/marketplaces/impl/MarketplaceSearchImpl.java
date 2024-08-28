package com.absolutavelas.absolutabackend.services.marketplaces.impl;

import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import com.absolutavelas.absolutabackend.database.repositories.marketplaces.MarketplaceRepository;
import com.absolutavelas.absolutabackend.database.repositories.marketplaces.MarketplaceTypeRepository;
import com.absolutavelas.absolutabackend.handlers.exceptions.ResourceNotFoundException;
import com.absolutavelas.absolutabackend.services.marketplaces.MarketplaceSearch;
import com.absolutavelas.absolutabackend.services.marketplaces.types.MarketplaceTypeSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MarketplaceSearchImpl implements MarketplaceSearch {
    private final MarketplaceRepository marketplaceRepository;
    private final MarketplaceTypeSearch marketplaceTypeSearch;

    public MarketplaceSearchImpl(MarketplaceRepository marketplaceRepository, MarketplaceTypeSearch marketplaceTypeSearch) {
        this.marketplaceRepository = marketplaceRepository;
        this.marketplaceTypeSearch = marketplaceTypeSearch;
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
    public List<Marketplace> findByType(UUID typeIdentifier) {
        marketplaceTypeSearch.findByIdentifier(typeIdentifier);

        return marketplaceRepository.findByType(typeIdentifier);
    }
}