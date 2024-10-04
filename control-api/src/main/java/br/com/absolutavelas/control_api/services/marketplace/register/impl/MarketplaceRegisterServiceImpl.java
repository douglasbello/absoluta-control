package br.com.absolutavelas.control_api.services.marketplace.register.impl;

import br.com.absolutavelas.control_api.database.models.Marketplace;
import br.com.absolutavelas.control_api.database.repositories.MarketplaceRepository;
import br.com.absolutavelas.control_api.services.marketplace.register.MarketplaceRegisterService;
import org.springframework.stereotype.Service;

@Service
public class MarketplaceRegisterServiceImpl implements MarketplaceRegisterService {
    private MarketplaceRepository marketplaceRepository;

    public MarketplaceRegisterServiceImpl(MarketplaceRepository marketplaceRepository) {
        this.marketplaceRepository = marketplaceRepository;
    }

    @Override
    public Marketplace register(Marketplace marketplace) {
        return marketplaceRepository.save(marketplace);
    }
}