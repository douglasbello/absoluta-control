package com.absolutavelas.absolutabackend.services.products.candles.impl;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import com.absolutavelas.absolutabackend.database.repositories.products.CandleRepository;
import com.absolutavelas.absolutabackend.dtos.products.candles.CandleRequest;
import com.absolutavelas.absolutabackend.services.products.candles.CandleRegisterService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CandleRegisterServiceImpl implements CandleRegisterService {
    private final CandleRepository candleRepository;

    public CandleRegisterServiceImpl(CandleRepository candleRepository) {
        this.candleRepository = candleRepository;
    }

    @Override
    public UUID register(CandleRequest request) {
        Candle candle = new Candle.Builder()
                .name(request.name())
                .description(request.description())
                .stockAmount(request.stockAmount())
                .price(request.price())
                .isActive(request.isActive())
                .build();

        candle = candleRepository.save(candle);

        return candle.getIdentifier();
    }
}