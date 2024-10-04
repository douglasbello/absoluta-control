package br.com.absolutavelas.control_api.services.marketplaces.register;

import br.com.absolutavelas.control_api.database.models.MarketplaceType;
import br.com.absolutavelas.control_api.dtos.marketplaces.MarketplaceTypeRequest;

public interface MarketplaceTypeRegisterService {
    MarketplaceType register(MarketplaceTypeRequest request);
}