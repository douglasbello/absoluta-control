package br.com.absolutavelas.control_api.services.products.register;

import br.com.absolutavelas.control_api.database.models.Flavour;
import br.com.absolutavelas.control_api.dtos.products.FlavourRequest;

public interface FlavourRegisterService {
    Flavour register(FlavourRequest request);
}