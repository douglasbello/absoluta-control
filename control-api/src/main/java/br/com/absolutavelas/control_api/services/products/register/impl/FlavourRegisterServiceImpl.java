package br.com.absolutavelas.control_api.services.products.register.impl;

import br.com.absolutavelas.control_api.database.models.Flavour;
import br.com.absolutavelas.control_api.database.repositories.FlavourRepository;
import br.com.absolutavelas.control_api.dtos.products.FlavourRequest;
import br.com.absolutavelas.control_api.services.products.register.FlavourRegisterService;
import br.com.absolutavelas.control_api.utils.mappers.impl.FlavourMapper;
import org.springframework.stereotype.Service;

@Service
public class FlavourRegisterServiceImpl implements FlavourRegisterService {
    private final FlavourRepository flavourRepository;
    private final FlavourMapper flavourMapper;

    public FlavourRegisterServiceImpl(FlavourRepository flavourRepository, FlavourMapper flavourMapper) {
        this.flavourRepository = flavourRepository;
        this.flavourMapper = flavourMapper;
    }

    @Override
    public Flavour register(FlavourRequest request) {
        return flavourRepository.save(flavourMapper.requestToEntity(request));
    }
}