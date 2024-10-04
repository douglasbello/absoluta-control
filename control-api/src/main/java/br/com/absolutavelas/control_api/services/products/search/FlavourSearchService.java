package br.com.absolutavelas.control_api.services.products.search;

import br.com.absolutavelas.control_api.database.models.Flavour;

public interface FlavourSearchService {
    Flavour findById(Integer id);
}