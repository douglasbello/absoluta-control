package com.absolutavelas.absolutabackend.controllers.products.flavours.impl;

import com.absolutavelas.absolutabackend.controllers.products.flavours.FlavourRegisterController;
import com.absolutavelas.absolutabackend.database.models.products.HomesprayFlavour;
import com.absolutavelas.absolutabackend.dtos.products.flavours.HomesprayFlavourRequest;
import com.absolutavelas.absolutabackend.services.products.flavours.impl.HomesprayFlavourRegisterServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/products/homesprays/flavours")
public class HomesprayFlavourRegisterControllerImpl implements FlavourRegisterController<HomesprayFlavour, HomesprayFlavourRequest> {
    private final HomesprayFlavourRegisterServiceImpl homesprayFlavourRegisterService;

    public HomesprayFlavourRegisterControllerImpl(HomesprayFlavourRegisterServiceImpl homesprayFlavourRegisterService) {
        this.homesprayFlavourRegisterService = homesprayFlavourRegisterService;
    }

    @PostMapping
    public ResponseEntity<HomesprayFlavour> register(@RequestBody HomesprayFlavourRequest request) {
        HomesprayFlavour flavour = homesprayFlavourRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{identifier}").buildAndExpand(flavour.getIdentifier()).toUri();

        return ResponseEntity.created(uri).body(flavour);
    }
}