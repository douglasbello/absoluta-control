package com.absolutavelas.absolutabackend.services.products.candles;

import com.absolutavelas.absolutabackend.dtos.candles.CandleRequest;

import java.util.UUID;

public interface CandleRegisterService {
    UUID register(CandleRequest request);
}