package com.absolutavelas.absolutabackend.database.repositories.products;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CandleRepository extends JpaRepository<Candle, UUID> {
}