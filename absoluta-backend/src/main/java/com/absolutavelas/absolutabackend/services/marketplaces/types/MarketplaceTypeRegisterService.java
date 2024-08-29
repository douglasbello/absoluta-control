package com.absolutavelas.absolutabackend.services.marketplaces.types;

import com.absolutavelas.absolutabackend.database.models.marketplaces.MarketplaceType;
import com.absolutavelas.absolutabackend.dtos.marketplaces.types.MarketplaceTypeRequest;

import java.util.UUID;

public interface MarketplaceTypeRegisterService {
    MarketplaceType register(MarketplaceTypeRequest request);
}