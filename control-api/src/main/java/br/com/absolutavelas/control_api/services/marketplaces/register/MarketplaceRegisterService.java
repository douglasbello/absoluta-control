package br.com.absolutavelas.control_api.services.marketplaces.register;

import br.com.absolutavelas.control_api.database.models.Marketplace;
import br.com.absolutavelas.control_api.dtos.marketplaces.MarketplaceRequest;

public interface MarketplaceRegisterService {
    Marketplace register(MarketplaceRequest request);
}