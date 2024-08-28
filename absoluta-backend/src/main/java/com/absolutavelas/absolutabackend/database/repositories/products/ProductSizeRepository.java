package com.absolutavelas.absolutabackend.database.repositories.products;

import com.absolutavelas.absolutabackend.database.models.products.ProductSize;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductSizeRepository extends JpaRepository<ProductSize, UUID> {
}