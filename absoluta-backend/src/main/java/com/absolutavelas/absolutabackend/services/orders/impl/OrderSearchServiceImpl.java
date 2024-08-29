package com.absolutavelas.absolutabackend.services.orders.impl;

import com.absolutavelas.absolutabackend.database.models.orders.Order;
import com.absolutavelas.absolutabackend.database.repositories.orders.OrderRepository;
import com.absolutavelas.absolutabackend.handlers.exceptions.ResourceNotFoundException;
import com.absolutavelas.absolutabackend.services.orders.OrderSearchService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderSearchServiceImpl implements OrderSearchService {
    private final OrderRepository orderRepository;

    public OrderSearchServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order findByIdentifier(UUID identifier) {
        return orderRepository.findById(identifier).orElseThrow(() -> new ResourceNotFoundException("Order", identifier));
    }

    @Override
    public Page<Order> findAll(Pageable pageable) {
        return orderRepository.findAll(pageable);
    }
}