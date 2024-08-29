package com.absolutavelas.absolutabackend.controllers.orders.paymenttypes;

import com.absolutavelas.absolutabackend.database.models.orders.PaymentType;
import com.absolutavelas.absolutabackend.dtos.orders.PaymentTypeRequest;
import org.springframework.http.ResponseEntity;

public interface PaymentTypeRegisterController {
    ResponseEntity<PaymentType> register(PaymentTypeRequest request);
}