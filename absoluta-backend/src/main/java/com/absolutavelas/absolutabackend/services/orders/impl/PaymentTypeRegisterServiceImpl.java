package com.absolutavelas.absolutabackend.services.orders.impl;

import com.absolutavelas.absolutabackend.database.models.orders.PaymentType;
import com.absolutavelas.absolutabackend.database.repositories.orders.PaymentTypeRepository;
import com.absolutavelas.absolutabackend.dtos.orders.PaymentTypeRequest;
import com.absolutavelas.absolutabackend.services.orders.PaymentTypeRegisterService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentTypeRegisterServiceImpl implements PaymentTypeRegisterService {
    private final PaymentTypeRepository paymentTypeRepository;

    public PaymentTypeRegisterServiceImpl(PaymentTypeRepository paymentTypeRepository) {
        this.paymentTypeRepository = paymentTypeRepository;
    }

    @Override
    public PaymentType register(PaymentTypeRequest request) {
        PaymentType type = new PaymentType(request.type());

        return paymentTypeRepository.save(type);
    }
}