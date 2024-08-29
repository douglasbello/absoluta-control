package com.absolutavelas.absolutabackend.services.orders.impl;

import com.absolutavelas.absolutabackend.database.models.orders.OrderProduct;
import com.absolutavelas.absolutabackend.database.repositories.orders.OrderProductRepository;
import com.absolutavelas.absolutabackend.dtos.orders.OrderProductRequest;
import com.absolutavelas.absolutabackend.services.orders.OrderProductRegisterService;
import org.springframework.stereotype.Service;

@Service
public class OrderProductRegisterServiceImpl implements OrderProductRegisterService {
    private final OrderProductRepository orderProductRepository;

    public OrderProductRegisterServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public void register(OrderProductRequest request) {
        OrderProduct op = new OrderProduct(request.orderIdentifier(), request.productIdentifier());

        orderProductRepository.save(op);
    }
}