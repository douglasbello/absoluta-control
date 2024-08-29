package com.absolutavelas.absolutabackend.services.orders;

import com.absolutavelas.absolutabackend.dtos.orders.OrderRequest;

import java.util.UUID;

public interface OrderRegisterService {
    UUID register(OrderRequest orderRequest);
}