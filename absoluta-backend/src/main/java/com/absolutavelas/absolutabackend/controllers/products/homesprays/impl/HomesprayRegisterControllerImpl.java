package com.absolutavelas.absolutabackend.controllers.products.homesprays.impl;

import com.absolutavelas.absolutabackend.controllers.products.homesprays.HomesprayRegisterController;
import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import com.absolutavelas.absolutabackend.dtos.products.homesprays.HomesprayRequest;
import com.absolutavelas.absolutabackend.services.products.homesprays.HomesprayRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/homesprays")
public class HomesprayRegisterControllerImpl implements HomesprayRegisterController {
    private final HomesprayRegisterService homesprayRegisterService;

    public HomesprayRegisterControllerImpl(HomesprayRegisterService homesprayRegisterService) {
        this.homesprayRegisterService = homesprayRegisterService;
    }

    @PostMapping
    public ResponseEntity<Homespray> register(HomesprayRequest request) {
        Homespray homespray = homesprayRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(homespray.getIdentifier()).toUri();

        return ResponseEntity.created(uri).body(homespray);
    }
}