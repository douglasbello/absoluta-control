package com.absolutavelas.absolutabackend.services.marketplaces;

import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import com.absolutavelas.absolutabackend.dtos.marketplaces.MarketplaceRequest;

import java.util.UUID;

public interface MarketplaceRegisterService {
    Marketplace register(MarketplaceRequest request);
}