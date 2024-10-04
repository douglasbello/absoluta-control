package br.com.absolutavelas.control_api.services.products.register.impl;

import br.com.absolutavelas.control_api.database.models.Flavour;
import br.com.absolutavelas.control_api.database.repositories.FlavourRepository;
import br.com.absolutavelas.control_api.services.products.register.FlavourRegisterService;
import org.springframework.stereotype.Service;

@Service
public class FlavourRegisterServiceImpl implements FlavourRegisterService {
    private final FlavourRepository flavourRepository;

    public FlavourRegisterServiceImpl(FlavourRepository flavourRepository) {
        this.flavourRepository = flavourRepository;
    }

    @Override
    public Flavour register(Flavour flavour) {
        return flavourRepository.save(flavour);
    }
}