package com.absolutavelas.absolutabackend.controllers.products.flavours.impl;

import com.absolutavelas.absolutabackend.controllers.products.flavours.FlavourSearchController;
import com.absolutavelas.absolutabackend.database.models.products.CandleFlavour;
import com.absolutavelas.absolutabackend.services.products.flavours.impl.CandleFlavourSearchServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products/candles/flavours")
public class CandleFlavourSearchControllerImpl implements FlavourSearchController<CandleFlavour> {
    private final CandleFlavourSearchServiceImpl candleFlavourSearchService;

    public CandleFlavourSearchControllerImpl(CandleFlavourSearchServiceImpl candleFlavourSearchService) {
        this.candleFlavourSearchService = candleFlavourSearchService;
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<CandleFlavour> findByIdentifier(@PathVariable UUID identifier) {
        return ResponseEntity.ok().body(candleFlavourSearchService.findByIdentifier(identifier));
    }

    @GetMapping("/name/{flavour}")
    public ResponseEntity<List<CandleFlavour>> findByFlavour(@PathVariable String flavour) {
        return ResponseEntity.ok().body(candleFlavourSearchService.findByFlavour(flavour));
    }
}