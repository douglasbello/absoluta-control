package com.absolutavelas.absolutabackend.controllers.products.homesprays;

import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import com.absolutavelas.absolutabackend.dtos.products.homesprays.HomesprayRequest;
import org.springframework.http.ResponseEntity;

public interface HomesprayRegisterController {
    ResponseEntity<Homespray> register(HomesprayRequest request);
}