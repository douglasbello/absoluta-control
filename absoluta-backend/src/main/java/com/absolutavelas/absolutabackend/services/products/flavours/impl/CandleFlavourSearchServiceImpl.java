package com.absolutavelas.absolutabackend.services.products.flavours.impl;

import com.absolutavelas.absolutabackend.database.models.products.CandleFlavour;
import com.absolutavelas.absolutabackend.database.repositories.products.CandleFlavourRepository;
import com.absolutavelas.absolutabackend.handlers.exceptions.ResourceNotFoundException;
import com.absolutavelas.absolutabackend.services.products.flavours.FlavourSearchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandleFlavourSearchServiceImpl implements FlavourSearchService<CandleFlavour> {
    private final CandleFlavourRepository candleFlavourRepository;

    public CandleFlavourSearchServiceImpl(CandleFlavourRepository candleFlavourRepository) {
        this.candleFlavourRepository = candleFlavourRepository;
    }

    @Override
    public CandleFlavour findByIdentifier(UUID identifier) {
        return candleFlavourRepository.findById(identifier).orElseThrow(() -> new ResourceNotFoundException("Candle flavour", identifier));
    }

    @Override
    public List<CandleFlavour> findByFlavour(String flavour) {
        return candleFlavourRepository.findByFlavour(flavour);
    }
}