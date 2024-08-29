package com.absolutavelas.absolutabackend.controllers.orders;

import com.absolutavelas.absolutabackend.database.models.orders.Order;
import com.absolutavelas.absolutabackend.dtos.orders.OrderRequest;
import org.springframework.http.ResponseEntity;

public interface OrderRegisterController {
    ResponseEntity<Order> register(OrderRequest request);
}