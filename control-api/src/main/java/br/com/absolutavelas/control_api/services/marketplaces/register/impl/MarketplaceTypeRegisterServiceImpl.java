package br.com.absolutavelas.control_api.services.marketplaces.register.impl;

import br.com.absolutavelas.control_api.database.models.MarketplaceType;
import br.com.absolutavelas.control_api.database.repositories.MarketplaceTypeRepository;
import br.com.absolutavelas.control_api.dtos.marketplaces.MarketplaceTypeRequest;
import br.com.absolutavelas.control_api.services.marketplaces.register.MarketplaceTypeRegisterService;
import br.com.absolutavelas.control_api.utils.mappers.impl.MarketplaceTypeMapper;
import org.springframework.stereotype.Service;

@Service
public class MarketplaceTypeRegisterServiceImpl implements MarketplaceTypeRegisterService {
    private final MarketplaceTypeRepository marketplaceTypeRepository;
    private final MarketplaceTypeMapper marketplaceTypeMapper;

    public MarketplaceTypeRegisterServiceImpl(MarketplaceTypeRepository marketplaceTypeRepository, MarketplaceTypeMapper marketplaceTypeMapper) {
        this.marketplaceTypeRepository = marketplaceTypeRepository;
        this.marketplaceTypeMapper = marketplaceTypeMapper;
    }

    @Override
    public MarketplaceType register(MarketplaceTypeRequest request) {
        MarketplaceType type = marketplaceTypeMapper.requestToEntity(request);

        return marketplaceTypeRepository.save(type);
    }
}