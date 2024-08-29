package com.absolutavelas.absolutabackend.controllers.products.flavours.impl;

import com.absolutavelas.absolutabackend.controllers.products.flavours.FlavourSearchController;
import com.absolutavelas.absolutabackend.database.models.products.HomesprayFlavour;
import com.absolutavelas.absolutabackend.services.products.flavours.impl.HomesprayFlavourSearchServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products/homesprays/flavours")
public class HomesprayFlavourSearchControllerImpl implements FlavourSearchController<HomesprayFlavour> {
    private final HomesprayFlavourSearchServiceImpl homesprayFlavourSearchService;

    public HomesprayFlavourSearchControllerImpl(HomesprayFlavourSearchServiceImpl homesprayFlavourSearchService) {
        this.homesprayFlavourSearchService = homesprayFlavourSearchService;
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<HomesprayFlavour> findByIdentifier(@PathVariable UUID identifier) {
        return ResponseEntity.ok().body(homesprayFlavourSearchService.findByIdentifier(identifier));
    }

    @GetMapping("/name/{flavour}")
    public ResponseEntity<List<HomesprayFlavour>> findByFlavour(@PathVariable String flavour) {
        return ResponseEntity.ok().body(homesprayFlavourSearchService.findByFlavour(flavour));
    }
}