package com.absolutavelas.absolutabackend.controllers.marketplaces;

import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import com.absolutavelas.absolutabackend.dtos.marketplaces.MarketplaceRequest;
import org.springframework.http.ResponseEntity;

public interface MarketplaceRegisterController {
    ResponseEntity<Marketplace> register(MarketplaceRequest request);
}