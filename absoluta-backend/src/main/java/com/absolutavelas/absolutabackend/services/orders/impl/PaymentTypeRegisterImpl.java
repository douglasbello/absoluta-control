package com.absolutavelas.absolutabackend.services.orders.impl;

import com.absolutavelas.absolutabackend.database.models.orders.PaymentType;
import com.absolutavelas.absolutabackend.database.repositories.orders.PaymentTypeRepository;
import com.absolutavelas.absolutabackend.dtos.orders.PaymentTypeRequest;
import com.absolutavelas.absolutabackend.services.orders.PaymentTypeRegister;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentTypeRegisterImpl implements PaymentTypeRegister {
    private PaymentTypeRepository paymentTypeRepository;

    public PaymentTypeRegisterImpl(PaymentTypeRepository paymentTypeRepository) {
        this.paymentTypeRepository = paymentTypeRepository;
    }

    @Override
    public UUID register(PaymentTypeRequest request) {
        PaymentType type = new PaymentType(request.type());

        type = paymentTypeRepository.save(type);

        return type.getIdentifier();
    }
}