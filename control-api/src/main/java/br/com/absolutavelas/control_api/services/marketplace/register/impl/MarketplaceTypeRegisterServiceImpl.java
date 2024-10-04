package br.com.absolutavelas.control_api.services.marketplace.register.impl;

import br.com.absolutavelas.control_api.database.models.MarketplaceType;
import br.com.absolutavelas.control_api.database.repositories.MarketplaceTypeRepository;
import br.com.absolutavelas.control_api.services.marketplace.register.MarketplaceTypeRegisterService;
import org.springframework.stereotype.Service;

@Service
public class MarketplaceTypeRegisterServiceImpl implements MarketplaceTypeRegisterService {
    private MarketplaceTypeRepository marketplaceTypeRepository;

    public MarketplaceTypeRegisterServiceImpl(MarketplaceTypeRepository marketplaceTypeRepository) {
        this.marketplaceTypeRepository = marketplaceTypeRepository;
    }

    @Override
    public MarketplaceType register(MarketplaceType type) {
        return marketplaceTypeRepository.save(type);
    }
}