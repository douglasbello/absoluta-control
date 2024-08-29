package com.absolutavelas.absolutabackend.controllers.products.candles;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface CandleSearchController {
    ResponseEntity<Candle> findByIdentifier(UUID identifier);
    ResponseEntity<Page<Candle>> findAll(Pageable pageable);
    ResponseEntity<Page<Candle>> allOrderedByStockAmountAsc(Pageable pageable);
    ResponseEntity<Page<Candle>> allOrderedByStockAmountDesc(Pageable pageable);
    ResponseEntity<Page<Candle>> bestSellers(Pageable pageable);
}