package com.absolutavelas.absolutabackend.controllers.products.candles.impl;

import com.absolutavelas.absolutabackend.controllers.products.candles.CandleRegisterController;
import com.absolutavelas.absolutabackend.database.models.products.Candle;
import com.absolutavelas.absolutabackend.dtos.products.candles.CandleRequest;
import com.absolutavelas.absolutabackend.services.products.candles.CandleRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/products/candles")
public class CandleRegisterControllerImpl implements CandleRegisterController {
    private final CandleRegisterService candleRegisterService;

    public CandleRegisterControllerImpl(CandleRegisterService candleRegisterService) {
        this.candleRegisterService = candleRegisterService;
    }

    @PostMapping
    public ResponseEntity<Candle> register(@RequestBody CandleRequest request) {
        Candle candle = candleRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{identifier}").buildAndExpand(candle.getIdentifier()).toUri();

        return ResponseEntity.created(uri).body(candle);
    }
}