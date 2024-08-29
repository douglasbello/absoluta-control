package com.absolutavelas.absolutabackend.controllers.orders.paymenttypes;

import com.absolutavelas.absolutabackend.database.models.orders.PaymentType;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public interface PaymentTypeSearchController {
    ResponseEntity<PaymentType> findByIdentifier(UUID identifier);
    ResponseEntity<List<PaymentType>> findAll();
}