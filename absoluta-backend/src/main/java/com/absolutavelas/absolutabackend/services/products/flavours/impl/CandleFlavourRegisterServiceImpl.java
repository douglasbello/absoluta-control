package com.absolutavelas.absolutabackend.services.products.flavours.impl;

import com.absolutavelas.absolutabackend.database.models.products.CandleFlavour;
import com.absolutavelas.absolutabackend.database.repositories.products.CandleFlavourRepository;
import com.absolutavelas.absolutabackend.dtos.products.flavours.CandleFlavourRequest;
import com.absolutavelas.absolutabackend.services.products.flavours.FlavourRegisterService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CandleFlavourRegisterServiceImpl implements FlavourRegisterService<CandleFlavourRequest> {
    private final CandleFlavourRepository candleFlavourRepository;

    public CandleFlavourRegisterServiceImpl(CandleFlavourRepository candleFlavourRepository) {
        this.candleFlavourRepository = candleFlavourRepository;
    }

    @Override
    public UUID register(CandleFlavourRequest request) {
        CandleFlavour flavour = new CandleFlavour(request.flavour());

        flavour = candleFlavourRepository.save(flavour);

        return flavour.getIdentifier();
    }
}