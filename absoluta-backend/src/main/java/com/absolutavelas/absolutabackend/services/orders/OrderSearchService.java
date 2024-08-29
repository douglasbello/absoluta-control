package com.absolutavelas.absolutabackend.services.orders;

import com.absolutavelas.absolutabackend.database.models.orders.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface OrderSearchService {
    Order findByIdentifier(UUID identifier);
    Page<Order> findAll(Pageable pageable);
}