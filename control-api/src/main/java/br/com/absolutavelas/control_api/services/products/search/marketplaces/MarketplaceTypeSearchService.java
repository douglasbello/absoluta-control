package br.com.absolutavelas.control_api.services.products.search.marketplaces;

import br.com.absolutavelas.control_api.database.models.MarketplaceType;

public interface MarketplaceTypeSearchService {
    MarketplaceType findById(Integer id);
}