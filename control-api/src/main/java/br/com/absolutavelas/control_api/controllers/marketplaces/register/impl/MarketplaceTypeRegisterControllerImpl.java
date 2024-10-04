package br.com.absolutavelas.control_api.controllers.register.marketplaces.register.impl;

import br.com.absolutavelas.control_api.controllers.register.marketplaces.register.MarketplaceTypeRegisterController;
import br.com.absolutavelas.control_api.database.models.MarketplaceType;
import br.com.absolutavelas.control_api.dtos.marketplaces.MarketplaceTypeRequest;
import br.com.absolutavelas.control_api.services.marketplaces.register.MarketplaceTypeRegisterService;
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
        MarketplaceType created = marketplaceTypeRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(created.getId()).toUri();

        return ResponseEntity.created(uri).body(created);
    }
}