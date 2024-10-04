package br.com.absolutavelas.control_api.services.products.search.marketplaces.impl;

import br.com.absolutavelas.control_api.database.models.PaymentType;
import br.com.absolutavelas.control_api.database.repositories.PaymentTypeRepository;
import br.com.absolutavelas.control_api.handlers.exceptions.NotFoundException;
import br.com.absolutavelas.control_api.services.products.search.marketplaces.PaymentTypeSearchService;
import org.springframework.stereotype.Service;

@Service
public class PaymentTypeSearchServiceImpl implements PaymentTypeSearchService {
    private final PaymentTypeRepository paymentTypeRepository;

    public PaymentTypeSearchServiceImpl(PaymentTypeRepository paymentTypeRepository) {
        this.paymentTypeRepository = paymentTypeRepository;
    }

    @Override
    public PaymentType findById(Integer id) {
        return paymentTypeRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }
}