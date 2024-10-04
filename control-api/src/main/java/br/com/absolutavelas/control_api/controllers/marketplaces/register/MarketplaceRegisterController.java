package br.com.absolutavelas.control_api.controllers.marketplaces.register;

import br.com.absolutavelas.control_api.database.models.Marketplace;
import br.com.absolutavelas.control_api.dtos.marketplaces.MarketplaceRequest;
import org.springframework.http.ResponseEntity;

public interface MarketplaceRegisterController {
    ResponseEntity<Marketplace> register(MarketplaceRequest request);
}