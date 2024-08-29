package com.absolutavelas.absolutabackend.controllers.products.flavours.impl;

import com.absolutavelas.absolutabackend.controllers.products.flavours.FlavourRegisterController;
import com.absolutavelas.absolutabackend.database.models.products.CandleFlavour;
import com.absolutavelas.absolutabackend.dtos.products.flavours.CandleFlavourRequest;
import com.absolutavelas.absolutabackend.services.products.flavours.impl.CandleFlavourRegisterServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/products/candles/flavours")
public class CandleFlavourRegisterControllerImpl implements FlavourRegisterController<CandleFlavour, CandleFlavourRequest> {
    private final CandleFlavourRegisterServiceImpl candleFlavourRegisterService;

    public CandleFlavourRegisterControllerImpl(CandleFlavourRegisterServiceImpl candleFlavourRegisterService) {
        this.candleFlavourRegisterService = candleFlavourRegisterService;
    }

    @PostMapping
    public ResponseEntity<CandleFlavour> register(@RequestBody CandleFlavourRequest request) {
        CandleFlavour candleFlavour = candleFlavourRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{identifier}").buildAndExpand(candleFlavour.getIdentifier()).toUri();

        return ResponseEntity.created(uri).body(candleFlavour);
    }
}