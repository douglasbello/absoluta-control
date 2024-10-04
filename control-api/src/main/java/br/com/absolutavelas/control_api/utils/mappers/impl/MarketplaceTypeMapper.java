package br.com.absolutavelas.control_api.utils.mappers.impl;

import br.com.absolutavelas.control_api.database.models.MarketplaceType;
import br.com.absolutavelas.control_api.dtos.marketplaces.MarketplaceTypeRequest;
import br.com.absolutavelas.control_api.utils.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class MarketplaceTypeMapper implements Mapper<MarketplaceType, MarketplaceTypeRequest> {
    @Override
    public MarketplaceType requestToEntity(MarketplaceTypeRequest request) {
        return new MarketplaceType(
                request.name()
        );
    }
}