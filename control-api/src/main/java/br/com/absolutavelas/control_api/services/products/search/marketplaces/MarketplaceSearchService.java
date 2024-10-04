package br.com.absolutavelas.control_api.services.products.search.marketplaces;

import br.com.absolutavelas.control_api.database.models.Marketplace;

public interface MarketplaceSearchService {
    Marketplace findById(Integer id);
}