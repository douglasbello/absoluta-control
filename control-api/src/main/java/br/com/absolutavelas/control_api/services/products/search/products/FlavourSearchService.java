package br.com.absolutavelas.control_api.services.products.search.products;

import br.com.absolutavelas.control_api.database.models.Flavour;

public interface FlavourSearchService {
    Flavour findById(Integer id);
}