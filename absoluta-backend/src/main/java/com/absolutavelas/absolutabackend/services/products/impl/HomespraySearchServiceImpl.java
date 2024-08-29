package com.absolutavelas.absolutabackend.services.products.impl;

import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import com.absolutavelas.absolutabackend.database.repositories.products.HomesprayRepository;
import com.absolutavelas.absolutabackend.handlers.exceptions.ResourceNotFoundException;
import com.absolutavelas.absolutabackend.services.products.ProductSearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class HomespraySearchServiceImpl implements ProductSearchService<Homespray> {
    private final HomesprayRepository homesprayRepository;

    public HomespraySearchServiceImpl(HomesprayRepository homesprayRepository) {
        this.homesprayRepository = homesprayRepository;
    }

    @Override
    public Homespray findByIdentifier(UUID identifier) {
        return homesprayRepository.findById(identifier).orElseThrow(() -> new ResourceNotFoundException("Homespray", identifier));
    }

    @Override
    public Page<Homespray> findAll(Pageable pageable) {
        return homesprayRepository.findAll(pageable);
    }

    @Override
    public Page<Homespray> allOrderedByStockAmountAsc(Pageable pageable) {
        return homesprayRepository.findAllOrderedByStockAmountAsc(pageable);
    }

    @Override
    public Page<Homespray> allOrderedByStockAmountDesc(Pageable pageable) {
        return homesprayRepository.findAllOrderedByStockAmountDesc(pageable);
    }

    @Override
    public Page<Homespray> bestSellers(Pageable pageable) {
        return null;
    }
}