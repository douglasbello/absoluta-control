package br.com.absolutavelas.control_api.services.marketplace.register;

import br.com.absolutavelas.control_api.database.models.Marketplace;

public interface MarketplaceRegisterService {
    Marketplace register(Marketplace marketplace);
}