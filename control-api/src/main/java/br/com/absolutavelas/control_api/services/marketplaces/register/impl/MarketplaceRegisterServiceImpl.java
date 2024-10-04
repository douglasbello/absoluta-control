package br.com.absolutavelas.control_api.services.marketplaces.register.impl;

import br.com.absolutavelas.control_api.database.models.Marketplace;
import br.com.absolutavelas.control_api.database.models.MarketplaceType;
import br.com.absolutavelas.control_api.database.repositories.MarketplaceRepository;
import br.com.absolutavelas.control_api.dtos.marketplaces.MarketplaceRequest;
import br.com.absolutavelas.control_api.services.marketplaces.register.MarketplaceRegisterService;
import br.com.absolutavelas.control_api.services.products.search.marketplaces.MarketplaceTypeSearchService;
import br.com.absolutavelas.control_api.utils.mappers.impl.MarketplaceMapper;
import org.springframework.stereotype.Service;

@Service
public class MarketplaceRegisterServiceImpl implements MarketplaceRegisterService {
    private final MarketplaceRepository marketplaceRepository;
    private final MarketplaceMapper marketplaceMapper;
    private final MarketplaceTypeSearchService marketplaceTypeSearchService;

    public MarketplaceRegisterServiceImpl(MarketplaceRepository marketplaceRepository,
                                          MarketplaceMapper marketplaceMapper,
                                          MarketplaceTypeSearchService marketplaceTypeSearchService) {
        this.marketplaceRepository = marketplaceRepository;
        this.marketplaceMapper = marketplaceMapper;
        this.marketplaceTypeSearchService = marketplaceTypeSearchService;
    }

    @Override
    public Marketplace register(MarketplaceRequest request) {
        MarketplaceType type = marketplaceTypeSearchService.findById(request.typeId());

        Marketplace marketplace = marketplaceMapper.requestToEntity(request);
        marketplace.setType(type);

        return marketplace;
    }
}