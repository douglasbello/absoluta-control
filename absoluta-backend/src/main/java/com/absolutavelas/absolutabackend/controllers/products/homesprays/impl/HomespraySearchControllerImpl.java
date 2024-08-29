package com.absolutavelas.absolutabackend.controllers.products.homesprays.impl;

import com.absolutavelas.absolutabackend.controllers.products.homesprays.HomespraySearchController;
import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import com.absolutavelas.absolutabackend.services.products.impl.HomespraySearchServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/homesprays")
public class HomespraySearchControllerImpl implements HomespraySearchController {
    private final HomespraySearchServiceImpl homespraySearchService;

    public HomespraySearchControllerImpl(HomespraySearchServiceImpl homespraySearchService) {
        this.homespraySearchService = homespraySearchService;
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<Homespray> findByIdentifier(@PathVariable UUID identifier) {
        return ResponseEntity.ok().body(homespraySearchService.findByIdentifier(identifier));
    }

    @GetMapping
    public ResponseEntity<Page<Homespray>> findAll(Pageable pageable) {
        return ResponseEntity.ok().body(homespraySearchService.findAll(pageable));
    }

    @GetMapping("/order/stock/asc")
    public ResponseEntity<Page<Homespray>> allOrderedByStockAmountAsc(Pageable pageable) {
        return ResponseEntity.ok().body(homespraySearchService.allOrderedByStockAmountAsc(pageable));
    }

    @GetMapping("/order/stock/desc")
    public ResponseEntity<Page<Homespray>> allOrderedByStockAmountDesc(Pageable pageable) {
        return ResponseEntity.ok().body(homespraySearchService.allOrderedByStockAmountDesc(pageable));
    }

    @GetMapping("/bestsellers")
    public ResponseEntity<Page<Homespray>> bestSellers(Pageable pageable) {
        return ResponseEntity.ok().body(homespraySearchService.bestSellers(pageable));
    }
}