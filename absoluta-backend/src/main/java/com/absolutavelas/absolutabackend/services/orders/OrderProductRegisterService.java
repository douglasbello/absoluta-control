package com.absolutavelas.absolutabackend.services.orders;

import com.absolutavelas.absolutabackend.dtos.orders.OrderProductRequest;

public interface OrderProductRegisterService {
    void register(OrderProductRequest request);
}