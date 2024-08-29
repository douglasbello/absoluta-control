package com.absolutavelas.absolutabackend.services.orders.impl;

import com.absolutavelas.absolutabackend.database.models.orders.PaymentType;
import com.absolutavelas.absolutabackend.database.repositories.orders.PaymentTypeRepository;
import com.absolutavelas.absolutabackend.handlers.exceptions.ResourceNotFoundException;
import com.absolutavelas.absolutabackend.services.orders.PaymentTypeSearchService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PaymentTypeSearchServiceImpl implements PaymentTypeSearchService {
    private final PaymentTypeRepository paymentTypeRepository;

    public PaymentTypeSearchServiceImpl(PaymentTypeRepository paymentTypeRepository) {
        this.paymentTypeRepository = paymentTypeRepository;
    }

    @Override
    public PaymentType findByIdentifier(UUID identifier) {
        return paymentTypeRepository.findById(identifier).orElseThrow(() -> new ResourceNotFoundException("Payment type", identifier));
    }

    @Override
    public List<PaymentType> findAll() {
        return paymentTypeRepository.findAll();
    }
}