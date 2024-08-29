package com.absolutavelas.absolutabackend.services.marketplaces.types;

import com.absolutavelas.absolutabackend.dtos.marketplaces.types.MarketplaceTypeRequest;

import java.util.UUID;

public interface MarketplaceTypeRegisterService {
    UUID register(MarketplaceTypeRequest request);
}