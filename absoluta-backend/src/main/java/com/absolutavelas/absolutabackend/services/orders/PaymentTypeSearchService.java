package com.absolutavelas.absolutabackend.services.orders;

import com.absolutavelas.absolutabackend.database.models.orders.PaymentType;

import java.util.List;
import java.util.UUID;

public interface PaymentTypeSearchService {
    PaymentType findByIdentifier(UUID identifier);
    List<PaymentType> findAll();
}