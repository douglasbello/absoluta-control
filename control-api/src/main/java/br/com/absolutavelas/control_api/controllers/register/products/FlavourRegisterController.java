package br.com.absolutavelas.control_api.controllers.register.products;

import br.com.absolutavelas.control_api.database.models.Flavour;
import br.com.absolutavelas.control_api.dtos.products.FlavourRequest;
import org.springframework.http.ResponseEntity;

public interface FlavourRegisterController {
    ResponseEntity<Flavour> register(FlavourRequest request);
}