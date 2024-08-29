package com.absolutavelas.absolutabackend.controllers.products.homesprays;

import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface HomespraySearchController {
    ResponseEntity<Homespray> findByIdentifier(UUID identifier);
    ResponseEntity<Page<Homespray>> findAll(Pageable pageable);
    ResponseEntity<Page<Homespray>> allOrderedByStockAmountAsc(Pageable pageable);
    ResponseEntity<Page<Homespray>> allOrderedByStockAmountDesc(Pageable pageable);
    ResponseEntity<Page<Homespray>> bestSellers(Pageable pageable);
}