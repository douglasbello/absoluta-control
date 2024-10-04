package br.com.absolutavelas.control_api.controllers.marketplaces.register.impl;

import br.com.absolutavelas.control_api.controllers.marketplaces.register.MarketplaceRegisterController;
import br.com.absolutavelas.control_api.database.models.Marketplace;
import br.com.absolutavelas.control_api.dtos.marketplaces.MarketplaceRequest;
import br.com.absolutavelas.control_api.services.marketplaces.register.MarketplaceRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
    public ResponseEntity<Marketplace> register(MarketplaceRequest request) {
        Marketplace created = marketplaceRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(created.getId()).toUri();

        return ResponseEntity.created(uri).body(created);
    }
}