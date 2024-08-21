package com.absolutavelas.absolutabackend.database.repositories.products;

import com.absolutavelas.absolutabackend.database.models.products.HomesprayFlavour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HomesprayFlavourRepository extends JpaRepository<HomesprayFlavour, UUID> {
}