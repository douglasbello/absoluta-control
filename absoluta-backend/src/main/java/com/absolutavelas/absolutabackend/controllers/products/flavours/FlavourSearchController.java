package com.absolutavelas.absolutabackend.controllers.products.flavours;

import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface FlavourSearchController<T> {
    ResponseEntity<T> findByIdentifier(UUID identifier);
    ResponseEntity<List<T>> findByFlavour(String flavour);
}