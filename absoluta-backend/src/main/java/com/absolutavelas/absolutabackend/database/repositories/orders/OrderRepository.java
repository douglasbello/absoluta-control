package com.absolutavelas.absolutabackend.database.repositories.orders;

import com.absolutavelas.absolutabackend.database.models.orders.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}