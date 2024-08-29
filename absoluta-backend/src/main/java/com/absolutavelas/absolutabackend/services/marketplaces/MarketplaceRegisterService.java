package com.absolutavelas.absolutabackend.services.marketplaces;

import com.absolutavelas.absolutabackend.dtos.marketplaces.MarketplaceRequest;

import java.util.UUID;

public interface MarketplaceRegisterService {
    UUID register(MarketplaceRequest request);
}