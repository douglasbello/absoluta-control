package com.absolutavelas.absolutabackend.services.products.flavours.impl;

import com.absolutavelas.absolutabackend.database.models.products.HomesprayFlavour;
import com.absolutavelas.absolutabackend.database.repositories.products.HomesprayFlavourRepository;
import com.absolutavelas.absolutabackend.dtos.products.flavours.HomesprayFlavourRequest;
import com.absolutavelas.absolutabackend.services.products.flavours.FlavourRegisterService;
import org.springframework.stereotype.Service;

@Service
public class HomesprayFlavourRegisterServiceImpl implements FlavourRegisterService<HomesprayFlavour, HomesprayFlavourRequest> {
    private final HomesprayFlavourRepository homesprayFlavourRepository;

    public HomesprayFlavourRegisterServiceImpl(HomesprayFlavourRepository homesprayFlavourRepository) {
        this.homesprayFlavourRepository = homesprayFlavourRepository;
    }

    @Override
    public HomesprayFlavour register(HomesprayFlavourRequest request) {
        HomesprayFlavour flavour = new HomesprayFlavour(request.flavour());

        return homesprayFlavourRepository.save(flavour);
    }
}