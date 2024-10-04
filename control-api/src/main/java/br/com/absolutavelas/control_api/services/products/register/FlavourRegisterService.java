package br.com.absolutavelas.control_api.services.products.register;

import br.com.absolutavelas.control_api.database.models.Flavour;

public interface FlavourRegisterService {
    Flavour register(Flavour flavour);
}