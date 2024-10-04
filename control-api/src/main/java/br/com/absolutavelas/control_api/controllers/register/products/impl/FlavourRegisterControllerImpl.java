package br.com.absolutavelas.control_api.controllers.register.products.impl;

import br.com.absolutavelas.control_api.controllers.register.products.FlavourRegisterController;
import br.com.absolutavelas.control_api.database.models.Flavour;
import br.com.absolutavelas.control_api.dtos.products.FlavourRequest;
import br.com.absolutavelas.control_api.services.products.register.FlavourRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/flavours")
public class FlavourRegisterControllerImpl implements FlavourRegisterController {
    private final FlavourRegisterService flavourRegisterService;

    public FlavourRegisterControllerImpl(FlavourRegisterService flavourRegisterService) {
        this.flavourRegisterService = flavourRegisterService;
    }

    @PostMapping
    public ResponseEntity<Flavour> register(@RequestBody FlavourRequest request) {
        return ResponseEntity.ok().body(flavourRegisterService.register(request));
    }
}