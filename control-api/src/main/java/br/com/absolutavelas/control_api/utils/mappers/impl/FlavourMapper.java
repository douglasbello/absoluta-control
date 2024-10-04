package br.com.absolutavelas.control_api.utils.mappers.impl;

import br.com.absolutavelas.control_api.database.models.Flavour;
import br.com.absolutavelas.control_api.dtos.products.FlavourRequest;
import br.com.absolutavelas.control_api.utils.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class FlavourMapper implements Mapper<Flavour, FlavourRequest> {
    @Override
    public Flavour requestToEntity(FlavourRequest request) {
        return new Flavour(request.name());
    }
}