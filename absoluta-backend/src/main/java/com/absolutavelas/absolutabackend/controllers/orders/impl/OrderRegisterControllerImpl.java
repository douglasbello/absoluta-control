package com.absolutavelas.absolutabackend.controllers.orders.impl;

import com.absolutavelas.absolutabackend.controllers.orders.OrderRegisterController;
import com.absolutavelas.absolutabackend.database.models.orders.Order;
import com.absolutavelas.absolutabackend.dtos.orders.OrderRequest;
import com.absolutavelas.absolutabackend.services.orders.OrderRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/orders")
public class OrderRegisterControllerImpl implements OrderRegisterController {
    private final OrderRegisterService orderRegisterService;

    public OrderRegisterControllerImpl(OrderRegisterService orderRegisterService) {
        this.orderRegisterService = orderRegisterService;
    }

    @PostMapping
    public ResponseEntity<Order> register(OrderRequest request) {
        Order order = orderRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{identifier}").buildAndExpand(order.getIdentifier()).toUri();

        return ResponseEntity.created(uri).body(order);
    }
}