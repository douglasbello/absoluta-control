package com.absolutavelas.absolutabackend.controllers.marketplaces.impl;

import com.absolutavelas.absolutabackend.controllers.marketplaces.MarketplaceRegisterController;
import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import com.absolutavelas.absolutabackend.dtos.marketplaces.MarketplaceRequest;
import com.absolutavelas.absolutabackend.services.marketplaces.MarketplaceRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/marketplaces")
public class MarketplaceRegisterControllerImpl implements MarketplaceRegisterController {
    private final MarketplaceRegisterService marketplaceRegisterService;

    public MarketplaceRegisterControllerImpl(MarketplaceRegisterService marketplaceRegisterService) {
        this.marketplaceRegisterService = marketplaceRegisterService;
    }

    @PostMapping
    public ResponseEntity<Marketplace> register(@RequestBody MarketplaceRequest request) {
        Marketplace marketplace = marketplaceRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{identifier}").buildAndExpand(marketplace.getIdentifier()).toUri();

        return ResponseEntity.created(uri).body(marketplace);
    }
}