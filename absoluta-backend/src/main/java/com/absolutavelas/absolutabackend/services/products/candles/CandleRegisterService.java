package com.absolutavelas.absolutabackend.services.products.candles;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import com.absolutavelas.absolutabackend.dtos.products.candles.CandleRequest;

public interface CandleRegisterService {
    Candle register(CandleRequest request);
}