package com.absolutavelas.absolutabackend.services.marketplaces.types.impl;

import com.absolutavelas.absolutabackend.database.models.marketplaces.MarketplaceType;
import com.absolutavelas.absolutabackend.database.repositories.marketplaces.MarketplaceTypeRepository;
import com.absolutavelas.absolutabackend.dtos.marketplaces.types.MarketplaceTypeRequest;
import com.absolutavelas.absolutabackend.services.marketplaces.types.MarketplaceTypeRegister;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MarketplaceTypeRegisterImpl implements MarketplaceTypeRegister {
    private final MarketplaceTypeRepository marketplaceTypeRepository;

    public MarketplaceTypeRegisterImpl(MarketplaceTypeRepository marketplaceTypeRepository) {
        this.marketplaceTypeRepository = marketplaceTypeRepository;
    }

    @Override
    public UUID register(MarketplaceTypeRequest request) {
        MarketplaceType type = new MarketplaceType(request.type());

        type = marketplaceTypeRepository.save(type);

        return type.getIdentifier();
    }
}