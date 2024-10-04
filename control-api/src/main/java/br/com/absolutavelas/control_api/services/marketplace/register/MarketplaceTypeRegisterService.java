package br.com.absolutavelas.control_api.services.marketplace.register;

import br.com.absolutavelas.control_api.database.models.MarketplaceType;

public interface MarketplaceTypeRegisterService {
    MarketplaceType register(MarketplaceType type);
}