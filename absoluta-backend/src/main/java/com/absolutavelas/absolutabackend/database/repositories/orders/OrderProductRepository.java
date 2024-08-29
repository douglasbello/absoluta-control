package com.absolutavelas.absolutabackend.database.repositories.orders;

import com.absolutavelas.absolutabackend.database.models.orders.OrderProduct;
import com.absolutavelas.absolutabackend.database.models.orders.OrderProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, OrderProductId> {
}