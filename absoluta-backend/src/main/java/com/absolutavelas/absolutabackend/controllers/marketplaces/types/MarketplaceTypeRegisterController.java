package com.absolutavelas.absolutabackend.controllers.marketplaces.types;

import com.absolutavelas.absolutabackend.database.models.marketplaces.MarketplaceType;
import com.absolutavelas.absolutabackend.dtos.marketplaces.types.MarketplaceTypeRequest;
import org.springframework.http.ResponseEntity;

public interface MarketplaceTypeRegisterController {
    ResponseEntity<MarketplaceType> register(MarketplaceTypeRequest request);
}