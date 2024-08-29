package com.absolutavelas.absolutabackend.services.products.impl;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import com.absolutavelas.absolutabackend.database.repositories.products.CandleRepository;
import com.absolutavelas.absolutabackend.handlers.exceptions.ResourceNotFoundException;
import com.absolutavelas.absolutabackend.services.products.ProductSearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CandleSearchServiceImpl implements ProductSearchService<Candle> {
    private final CandleRepository candleRepository;

    public CandleSearchServiceImpl(CandleRepository candleRepository) {
        this.candleRepository = candleRepository;
    }

    @Override
    public Candle findByIdentifier(UUID identifier) {
        return candleRepository.findById(identifier).orElseThrow(() -> new ResourceNotFoundException("Candle", identifier));
    }

    @Override
    public Page<Candle> findAll(Pageable pageable) {
        return candleRepository.findAll(pageable);
    }

    @Override
    public Page<Candle> allOrderedByStockAmountAsc(Pageable pageable) {
        return candleRepository.findAllOrderedByStockAmountAsc(pageable);
    }

    @Override
    public Page<Candle> allOrderedByStockAmountDesc(Pageable pageable) {
        return candleRepository.findAllOrderedByStockAmountDesc(pageable);
    }

    @Override
    public Page<Candle> bestSellers(Pageable pageable) {
        return null;
    }
}