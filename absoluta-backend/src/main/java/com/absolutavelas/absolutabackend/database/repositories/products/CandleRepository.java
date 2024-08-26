package com.absolutavelas.absolutabackend.database.repositories.products;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface CandleRepository extends JpaRepository<Candle, UUID> {
    @Query(value = "SELECT c FROM Candle c ORDER BY c.stockAmount")
    Page<Candle> findAllOrderedByStockAmountAsc(Pageable pageable);
    @Query(value = "SELECT c FROM Candle c ORDER BY c.stockAmount DESC")
    Page<Candle> findAllOrderedByStockAmountDesc(Pageable pageable);
}