package com.absolutavelas.absolutabackend.database.repositories.marketplaces;

import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface MarketplaceRepository extends JpaRepository<Marketplace, UUID> {
    @Query(value = "SELECT m FROM Marketplace m WHERE LOWER(m.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    Page<Marketplace> findByName(@Param("name") String name, Pageable pageable);
    @Query(value = "SELECT m FROM Marketplace m WHERE m.identifier = :type")
    List<Marketplace> findByType(@Param("type") UUID typeIdentifier);
}