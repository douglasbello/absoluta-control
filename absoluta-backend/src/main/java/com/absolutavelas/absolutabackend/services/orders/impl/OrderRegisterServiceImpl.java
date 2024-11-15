package com.absolutavelas.absolutabackend.services.orders.impl;

import com.absolutavelas.absolutabackend.database.models.orders.Order;
import com.absolutavelas.absolutabackend.database.models.orders.OrderProduct;
import com.absolutavelas.absolutabackend.database.repositories.orders.OrderProductRepository;
import com.absolutavelas.absolutabackend.database.repositories.orders.OrderRepository;
import com.absolutavelas.absolutabackend.dtos.orders.OrderRequest;
import com.absolutavelas.absolutabackend.services.marketplaces.MarketplaceSearchService;
import com.absolutavelas.absolutabackend.services.orders.OrderRegisterService;
import com.absolutavelas.absolutabackend.services.orders.PaymentTypeSearchService;
import org.springframework.stereotype.Service;

@Service
public class OrderRegisterServiceImpl implements OrderRegisterService {
    private final OrderRepository orderRepository;
    private final PaymentTypeSearchService paymentTypeSearchService;
    private final MarketplaceSearchService marketplaceSearchService;
    private final OrderProductRepository orderProductRepository;

    public OrderRegisterServiceImpl(OrderRepository orderRepository, PaymentTypeSearchService paymentTypeSearchService, MarketplaceSearchService marketplaceSearchService, OrderProductRepository orderProductRepository) {
        this.orderRepository = orderRepository;
        this.paymentTypeSearchService = paymentTypeSearchService;
        this.marketplaceSearchService = marketplaceSearchService;
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public Order register(OrderRequest orderRequest) {
        paymentTypeSearchService.findByIdentifier(orderRequest.paymentTypeIdentifier());
        marketplaceSearchService.findByIdentifier(orderRequest.marketplaceIdentifier());

        Order order = new Order(orderRequest.amount(), orderRequest.subTotal(), orderRequest.discount(), orderRequest.total(), orderRequest.paymentTypeIdentifier(), orderRequest.marketplaceIdentifier());
        order = orderRepository.save(order);

        Order finalOrder = order;
        orderRequest.productsIdentifiers().forEach(id -> {
            OrderProduct op = new OrderProduct(finalOrder.getIdentifier(), id);
            orderProductRepository.save(op);
        });

        return order;
    }
}