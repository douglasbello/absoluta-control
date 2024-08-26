package com.absolutavelas.absolutabackend.services.flavours.impl;

import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import com.absolutavelas.absolutabackend.database.models.products.HomesprayFlavour;
import com.absolutavelas.absolutabackend.database.repositories.products.HomesprayFlavourRepository;
import com.absolutavelas.absolutabackend.dtos.flavours.HomesprayFlavourRequest;
import com.absolutavelas.absolutabackend.services.flavours.FlavourRegisterService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class HomesprayFlavourRegisterServiceImpl implements FlavourRegisterService<HomesprayFlavourRequest> {
    private final HomesprayFlavourRepository homesprayFlavourRepository;

    public HomesprayFlavourRegisterServiceImpl(HomesprayFlavourRepository homesprayFlavourRepository) {
        this.homesprayFlavourRepository = homesprayFlavourRepository;
    }

    @Override
    public UUID register(HomesprayFlavourRequest request) {
        HomesprayFlavour flavour = new HomesprayFlavour(request.flavour());

        flavour = homesprayFlavourRepository.save(flavour);

        return flavour.getIdentifier();
    }
}