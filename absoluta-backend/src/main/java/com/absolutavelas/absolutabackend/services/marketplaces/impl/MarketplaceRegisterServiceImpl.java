package com.absolutavelas.absolutabackend.services.marketplaces.impl;

import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import com.absolutavelas.absolutabackend.database.repositories.marketplaces.MarketplaceRepository;
import com.absolutavelas.absolutabackend.dtos.marketplaces.MarketplaceRequest;
import com.absolutavelas.absolutabackend.services.marketplaces.MarketplaceRegisterService;
import com.absolutavelas.absolutabackend.services.marketplaces.types.MarketplaceTypeSearchService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MarketplaceRegisterServiceImpl implements MarketplaceRegisterService {
    private final MarketplaceRepository marketplaceRepository;
    private final MarketplaceTypeSearchService marketplaceTypeSearchService;

    public MarketplaceRegisterServiceImpl(MarketplaceRepository marketplaceRepository, MarketplaceTypeSearchService marketplaceTypeSearchService) {
        this.marketplaceRepository = marketplaceRepository;
        this.marketplaceTypeSearchService = marketplaceTypeSearchService;
    }

    @Override
    public Marketplace register(MarketplaceRequest request) {
        marketplaceTypeSearchService.findByIdentifier(request.typeIdentifier()); // will throw exception if not found

        Marketplace marketplace = new Marketplace(request.name(), request.location(), request.typeIdentifier());

        return marketplaceRepository.save(marketplace);
    }
}