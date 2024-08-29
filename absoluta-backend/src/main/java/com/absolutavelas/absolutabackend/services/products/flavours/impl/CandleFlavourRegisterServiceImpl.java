package com.absolutavelas.absolutabackend.services.products.flavours.impl;

import com.absolutavelas.absolutabackend.database.models.products.CandleFlavour;
import com.absolutavelas.absolutabackend.database.repositories.products.CandleFlavourRepository;
import com.absolutavelas.absolutabackend.dtos.products.flavours.CandleFlavourRequest;
import com.absolutavelas.absolutabackend.services.products.flavours.FlavourRegisterService;
import org.springframework.stereotype.Service;

@Service
public class CandleFlavourRegisterServiceImpl implements FlavourRegisterService<CandleFlavour, CandleFlavourRequest> {
    private final CandleFlavourRepository candleFlavourRepository;

    public CandleFlavourRegisterServiceImpl(CandleFlavourRepository candleFlavourRepository) {
        this.candleFlavourRepository = candleFlavourRepository;
    }

    @Override
    public CandleFlavour register(CandleFlavourRequest request) {
        CandleFlavour flavour = new CandleFlavour(request.flavour());

        return candleFlavourRepository.save(flavour);
    }
}