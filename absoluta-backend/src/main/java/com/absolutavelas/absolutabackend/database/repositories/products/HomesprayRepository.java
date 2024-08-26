package com.absolutavelas.absolutabackend.database.repositories.products;

import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface HomesprayRepository extends JpaRepository<Homespray, UUID> {
    @Query(value = "SELECT h FROM Homespray h ORDER BY h.stockAmount")
    Page<Homespray> findAllOrderedByStockAmountAsc(Pageable pageable);
    @Query(value = "SELECT h FROM Homespray h ORDER BY h.stockAmount DESC")
    Page<Homespray> findAllOrderedByStockAmountDesc(Pageable pageable);
}