package com.absolutavelas.absolutabackend.controllers.marketplaces.types.impl;

import com.absolutavelas.absolutabackend.controllers.marketplaces.types.MarketplaceTypeRegisterController;
import com.absolutavelas.absolutabackend.database.models.marketplaces.MarketplaceType;
import com.absolutavelas.absolutabackend.dtos.marketplaces.types.MarketplaceTypeRequest;
import com.absolutavelas.absolutabackend.services.marketplaces.types.MarketplaceTypeRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/marketplaces/types")
public class MarketplaceTypeRegisterControllerImpl implements MarketplaceTypeRegisterController {
    private final MarketplaceTypeRegisterService marketplaceTypeRegisterService;

    public MarketplaceTypeRegisterControllerImpl(MarketplaceTypeRegisterService marketplaceTypeRegisterService) {
        this.marketplaceTypeRegisterService = marketplaceTypeRegisterService;
    }

    @PostMapping
    public ResponseEntity<MarketplaceType> register(@RequestBody MarketplaceTypeRequest request) {
        MarketplaceType type = marketplaceTypeRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{identifier}").buildAndExpand(type.getIdentifier()).toUri();

        return ResponseEntity.created(uri).body(type);
    }
}