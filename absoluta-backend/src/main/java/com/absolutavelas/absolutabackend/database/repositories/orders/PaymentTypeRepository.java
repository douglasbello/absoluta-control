package com.absolutavelas.absolutabackend.database.repositories.orders;

import com.absolutavelas.absolutabackend.database.models.orders.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, UUID> {
}