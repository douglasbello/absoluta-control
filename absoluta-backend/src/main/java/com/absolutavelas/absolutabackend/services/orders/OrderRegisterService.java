package com.absolutavelas.absolutabackend.services.orders;

import com.absolutavelas.absolutabackend.database.models.orders.Order;
import com.absolutavelas.absolutabackend.dtos.orders.OrderRequest;

public interface OrderRegisterService {
    Order register(OrderRequest orderRequest);
}