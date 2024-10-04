package br.com.absolutavelas.control_api.utils.mappers.impl;

import br.com.absolutavelas.control_api.database.models.Marketplace;
import br.com.absolutavelas.control_api.dtos.marketplaces.MarketplaceRequest;
import br.com.absolutavelas.control_api.utils.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class MarketplaceMapper implements Mapper<Marketplace, MarketplaceRequest> {
    @Override
    public Marketplace requestToEntity(MarketplaceRequest request) {
        return new Marketplace(
                request.name(),
                request.location()
        );
    }
}