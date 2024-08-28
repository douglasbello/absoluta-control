package com.absolutavelas.absolutabackend.database.repositories.products;

import com.absolutavelas.absolutabackend.database.models.products.CandleFlavour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface CandleFlavourRepository extends JpaRepository<CandleFlavour, UUID> {
    @Query(value = "SELECT f FROM CandleFlavour f WHERE LOWER(f.flavour) LIKE LOWER(CONCAT('%', :flavour, '%'))")
    List<CandleFlavour> findByFlavour(@Param("name") String flavour);
}