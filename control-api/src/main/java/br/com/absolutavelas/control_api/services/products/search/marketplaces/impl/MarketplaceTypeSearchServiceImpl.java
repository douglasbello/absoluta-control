package br.com.absolutavelas.control_api.services.products.search.marketplaces.impl;

import br.com.absolutavelas.control_api.database.models.MarketplaceType;
import br.com.absolutavelas.control_api.database.repositories.MarketplaceTypeRepository;
import br.com.absolutavelas.control_api.handlers.exceptions.NotFoundException;
import br.com.absolutavelas.control_api.services.products.search.marketplaces.MarketplaceTypeSearchService;
import org.springframework.stereotype.Service;

@Service
public class MarketplaceTypeSearchServiceImpl implements MarketplaceTypeSearchService {
    private final MarketplaceTypeRepository marketplaceTypeRepository;

    public MarketplaceTypeSearchServiceImpl(MarketplaceTypeRepository marketplaceTypeRepository) {
        this.marketplaceTypeRepository = marketplaceTypeRepository;
    }

    @Override
    public MarketplaceType findById(Integer id) {
        return marketplaceTypeRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }
}