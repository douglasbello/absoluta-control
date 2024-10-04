package br.com.absolutavelas.control_api.services.products.search.impl;

import br.com.absolutavelas.control_api.database.models.Flavour;
import br.com.absolutavelas.control_api.database.repositories.FlavourRepository;
import br.com.absolutavelas.control_api.handlers.exceptions.NotFoundException;
import br.com.absolutavelas.control_api.services.products.search.FlavourSearchService;
import org.springframework.stereotype.Service;

@Service
public class FlavourSearchServiceImpl implements FlavourSearchService {
    private final FlavourRepository flavourRepository;

    public FlavourSearchServiceImpl(FlavourRepository flavourRepository) {
        this.flavourRepository = flavourRepository;
    }

    @Override
    public Flavour findById(Integer id) {
        return flavourRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }
}