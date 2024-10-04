package br.com.absolutavelas.control_api.services.products.search.marketplaces.impl;

import br.com.absolutavelas.control_api.database.models.Marketplace;
import br.com.absolutavelas.control_api.database.repositories.MarketplaceRepository;
import br.com.absolutavelas.control_api.handlers.exceptions.NotFoundException;
import br.com.absolutavelas.control_api.services.products.search.marketplaces.MarketplaceSearchService;
import org.springframework.stereotype.Service;

@Service
public class MarketplaceSearchServiceImpl implements MarketplaceSearchService {
    private final MarketplaceRepository marketplaceRepository;

    public MarketplaceSearchServiceImpl(MarketplaceRepository marketplaceRepository) {
        this.marketplaceRepository = marketplaceRepository;
    }

    @Override
    public Marketplace findById(Integer id) {
        return marketplaceRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }
}