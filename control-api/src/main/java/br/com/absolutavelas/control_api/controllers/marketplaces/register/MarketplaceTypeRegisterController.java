package br.com.absolutavelas.control_api.controllers.marketplaces.register;

import br.com.absolutavelas.control_api.database.models.MarketplaceType;
import br.com.absolutavelas.control_api.dtos.marketplaces.MarketplaceTypeRequest;
import org.springframework.http.ResponseEntity;

public interface MarketplaceTypeRegisterController {
    ResponseEntity<MarketplaceType> register(MarketplaceTypeRequest request);
}