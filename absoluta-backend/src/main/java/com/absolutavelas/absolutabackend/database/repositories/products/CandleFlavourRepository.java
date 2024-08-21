package com.absolutavelas.absolutabackend.database.repositories.products;

import com.absolutavelas.absolutabackend.database.models.products.CandleFlavour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CandleFlavourRepository extends JpaRepository<CandleFlavour, UUID> {
}