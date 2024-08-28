package com.absolutavelas.absolutabackend.services.products.homesprays.impl;

import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import com.absolutavelas.absolutabackend.database.repositories.products.HomesprayRepository;
import com.absolutavelas.absolutabackend.dtos.products.homesprays.HomesprayRequest;
import com.absolutavelas.absolutabackend.services.products.homesprays.HomesprayRegisterService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class HomesprayRegisterServiceImpl implements HomesprayRegisterService {
    private final HomesprayRepository homesprayRepository;

    public HomesprayRegisterServiceImpl(HomesprayRepository homesprayRepository) {
        this.homesprayRepository = homesprayRepository;
    }

    @Override
    public UUID register(HomesprayRequest request) {
        Homespray homespray = new Homespray.Builder()
                .name(request.name())
                .description(request.description())
                .stockAmount(request.stockAmount())
                .price(request.price())
                .isActive(request.isActive())
                .build();

        homespray = homesprayRepository.save(homespray);

        return homespray.getIdentifier();
    }
}