package com.absolutavelas.absolutabackend.database.repositories;

import com.absolutavelas.absolutabackend.database.models.marketplaces.MarketplaceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface MarketplaceTypeRepository extends JpaRepository<MarketplaceType, UUID> {
    @Query(value = "SELECT m FROM MarketplaceType m WHERE LOWER(m.type) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<MarketplaceType> findAllByTypeName(@Param("name") String name);
}