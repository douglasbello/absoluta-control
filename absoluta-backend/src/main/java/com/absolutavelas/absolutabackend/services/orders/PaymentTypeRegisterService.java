package com.absolutavelas.absolutabackend.services.orders;

import com.absolutavelas.absolutabackend.database.models.orders.PaymentType;
import com.absolutavelas.absolutabackend.dtos.orders.PaymentTypeRequest;

public interface PaymentTypeRegisterService {
    PaymentType register(PaymentTypeRequest request);
}