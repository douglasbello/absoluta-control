package com.absolutavelas.absolutabackend.controllers.products.candles.impl;

import com.absolutavelas.absolutabackend.controllers.products.candles.CandleSearchController;
import com.absolutavelas.absolutabackend.database.models.products.Candle;
import com.absolutavelas.absolutabackend.services.products.impl.CandleSearchServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/candles")
public class CandleSearchControllerImpl implements CandleSearchController {
    private final CandleSearchServiceImpl candleSearchService;

    public CandleSearchControllerImpl(CandleSearchServiceImpl candleSearchService) {
        this.candleSearchService = candleSearchService;
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<Candle> findByIdentifier(@PathVariable UUID identifier) {
        return ResponseEntity.ok().body(candleSearchService.findByIdentifier(identifier));
    }

    @GetMapping
    public ResponseEntity<Page<Candle>> findAll(Pageable pageable) {
        return ResponseEntity.ok().body(candleSearchService.findAll(pageable));
    }

    @GetMapping("/order/stock/asc")
    public ResponseEntity<Page<Candle>> allOrderedByStockAmountAsc(Pageable pageable) {
        return ResponseEntity.ok().body(candleSearchService.allOrderedByStockAmountAsc(pageable));
    }

    @GetMapping("/order/stock/desc")
    public ResponseEntity<Page<Candle>> allOrderedByStockAmountDesc(Pageable pageable) {
        return ResponseEntity.ok().body(candleSearchService.allOrderedByStockAmountDesc(pageable));
    }

    @GetMapping("/bestsellers")
    public ResponseEntity<Page<Candle>> bestSellers(Pageable pageable) {
        return ResponseEntity.ok().body(candleSearchService.bestSellers(pageable));
    }
}