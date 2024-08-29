package com.absolutavelas.absolutabackend.services.orders.impl;

import com.absolutavelas.absolutabackend.database.models.orders.Order;
import com.absolutavelas.absolutabackend.database.models.orders.OrderProduct;
import com.absolutavelas.absolutabackend.database.repositories.orders.OrderProductRepository;
import com.absolutavelas.absolutabackend.database.repositories.orders.OrderRepository;
import com.absolutavelas.absolutabackend.dtos.orders.OrderRequest;
import com.absolutavelas.absolutabackend.services.marketplaces.MarketplaceSearch;
import com.absolutavelas.absolutabackend.services.orders.OrderRegisterService;
import com.absolutavelas.absolutabackend.services.orders.PaymentTypeSearch;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderRegisterServiceImpl implements OrderRegisterService {
    private final OrderRepository orderRepository;
    private final PaymentTypeSearch paymentTypeSearch;
    private final MarketplaceSearch marketplaceSearch;
    private final OrderProductRepository orderProductRepository;

    public OrderRegisterServiceImpl(OrderRepository orderRepository, PaymentTypeSearch paymentTypeSearch, MarketplaceSearch marketplaceSearch, OrderProductRepository orderProductRepository) {
        this.orderRepository = orderRepository;
        this.paymentTypeSearch = paymentTypeSearch;
        this.marketplaceSearch = marketplaceSearch;
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public UUID register(OrderRequest orderRequest) {
        paymentTypeSearch.findByIdentifier(orderRequest.paymentTypeIdentifier());
        marketplaceSearch.findByIdentifier(orderRequest.marketplaceIdentifier());

        Order order = new Order(orderRequest.amount(), orderRequest.subTotal(), orderRequest.discount(), orderRequest.total(), orderRequest.paymentTypeIdentifier(), orderRequest.marketplaceIdentifier());
        order = orderRepository.save(order);

        Order finalOrder = order;
        orderRequest.productsIdentifiers().forEach(id -> {
            OrderProduct op = new OrderProduct(finalOrder.getIdentifier(), id);
            orderProductRepository.save(op);
        });

        return order.getIdentifier();
    }
}