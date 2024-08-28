package com.absolutavelas.absolutabackend.database.repositories.products;

import com.absolutavelas.absolutabackend.database.models.products.HomesprayFlavour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface HomesprayFlavourRepository extends JpaRepository<HomesprayFlavour, UUID> {
    @Query(value = "SELECT f FROM HomesprayFlavour f WHERE LOWER(f.flavour) LIKE LOWER(CONCAT('%', :flavour, '%'))")
    List<HomesprayFlavour> findByFlavour(@Param("flavour") String flavour);
}