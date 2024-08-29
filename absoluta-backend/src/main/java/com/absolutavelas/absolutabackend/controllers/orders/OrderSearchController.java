package com.absolutavelas.absolutabackend.controllers.orders;

import com.absolutavelas.absolutabackend.database.models.orders.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public interface OrderSearchController {
    ResponseEntity<Order> findByIdentifier(UUID identifier);
    ResponseEntity<Page<Order>> findAll(Pageable pageable);
}