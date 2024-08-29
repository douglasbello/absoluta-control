package com.absolutavelas.absolutabackend.controllers.products.flavours;

import org.springframework.http.ResponseEntity;

public interface FlavourRegisterController<T, D> {
    ResponseEntity<T> register(D request);
}