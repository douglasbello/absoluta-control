package com.absolutavelas.absolutabackend.services.marketplaces.impl;

import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import com.absolutavelas.absolutabackend.database.repositories.marketplaces.MarketplaceRepository;
import com.absolutavelas.absolutabackend.dtos.marketplaces.MarketplaceRequest;
import com.absolutavelas.absolutabackend.services.marketplaces.MarketplaceRegister;
import com.absolutavelas.absolutabackend.services.marketplaces.types.MarketplaceTypeSearch;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MarketplaceRegisterImpl implements MarketplaceRegister {
    private final MarketplaceRepository marketplaceRepository;
    private final MarketplaceTypeSearch marketplaceTypeSearch;

    public MarketplaceRegisterImpl(MarketplaceRepository marketplaceRepository, MarketplaceTypeSearch marketplaceTypeSearch) {
        this.marketplaceRepository = marketplaceRepository;
        this.marketplaceTypeSearch = marketplaceTypeSearch;
    }

    @Override
    public UUID register(MarketplaceRequest request) {
        marketplaceTypeSearch.findByIdentifier(request.typeIdentifier()); // will throw exception if not found

        Marketplace marketplace = new Marketplace(request.name(), request.location(), request.typeIdentifier());

        marketplace = marketplaceRepository.save(marketplace);

        return marketplace.getIdentifier();
    }
}