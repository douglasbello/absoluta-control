package com.absolutavelas.absolutabackend.controllers.orders.impl;

import com.absolutavelas.absolutabackend.controllers.orders.OrderSearchController;
import com.absolutavelas.absolutabackend.database.models.orders.Order;
import com.absolutavelas.absolutabackend.services.orders.OrderSearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderSearchControllerImpl implements OrderSearchController {
    private final OrderSearchService orderSearchService;

    public OrderSearchControllerImpl(OrderSearchService orderSearchService) {
        this.orderSearchService = orderSearchService;
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<Order> findByIdentifier(@PathVariable UUID identifier) {
        return ResponseEntity.ok().body(orderSearchService.findByIdentifier(identifier));
    }

    @GetMapping
    public ResponseEntity<Page<Order>> findAll(Pageable pageable) {
        return ResponseEntity.ok().body(orderSearchService.findAll(pageable));
    }
}