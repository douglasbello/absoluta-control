package com.absolutavelas.absolutabackend.services.orders;

import com.absolutavelas.absolutabackend.dtos.orders.PaymentTypeRequest;

import java.util.UUID;

public interface PaymentTypeRegister {
    UUID register(PaymentTypeRequest request);
}