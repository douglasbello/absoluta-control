package com.absolutavelas.absolutabackend.services.products;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface ProductSearchService<T> {
    T findByIdentifier(UUID identifier);
    Page<T> findAll(Pageable pageable);
    Page<T> allOrderedByStockAmountAsc(Pageable pageable);
    Page<T> allOrderedByStockAmountDesc(Pageable pageable);
    Page<T> bestSellers(Pageable pageable);
}