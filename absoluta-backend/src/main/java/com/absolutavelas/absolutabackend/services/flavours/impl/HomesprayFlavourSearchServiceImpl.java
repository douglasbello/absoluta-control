package com.absolutavelas.absolutabackend.services.flavours.impl;

import com.absolutavelas.absolutabackend.database.models.products.HomesprayFlavour;
import com.absolutavelas.absolutabackend.database.repositories.products.HomesprayFlavourRepository;
import com.absolutavelas.absolutabackend.handlers.exceptions.ResourceNotFoundException;
import com.absolutavelas.absolutabackend.services.flavours.FlavourSearchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HomesprayFlavourSearchServiceImpl implements FlavourSearchService<HomesprayFlavour> {
    private final HomesprayFlavourRepository homesprayFlavourRepository;

    public HomesprayFlavourSearchServiceImpl(HomesprayFlavourRepository homesprayFlavourRepository) {
        this.homesprayFlavourRepository = homesprayFlavourRepository;
    }

    @Override
    public HomesprayFlavour findByIdentifier(UUID identifier) {
        return homesprayFlavourRepository.findById(identifier).orElseThrow(() -> new ResourceNotFoundException("Homespray flavour", identifier));
    }

    @Override
    public List<HomesprayFlavour> findByFlavour(String flavour) {
        return homesprayFlavourRepository.findByFlavour(flavour);
    }
}