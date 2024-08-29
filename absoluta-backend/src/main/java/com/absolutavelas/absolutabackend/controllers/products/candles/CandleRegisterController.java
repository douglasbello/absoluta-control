package com.absolutavelas.absolutabackend.controllers.products.candles;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import com.absolutavelas.absolutabackend.dtos.products.candles.CandleRequest;
import org.springframework.http.ResponseEntity;

public interface CandleRegisterController {
    ResponseEntity<Candle> register(CandleRequest request);
}