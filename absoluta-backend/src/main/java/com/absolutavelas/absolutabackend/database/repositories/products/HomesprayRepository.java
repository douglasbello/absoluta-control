package com.absolutavelas.absolutabackend.database.repositories.products;

import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HomesprayRepository extends JpaRepository<Homespray, UUID> {
}