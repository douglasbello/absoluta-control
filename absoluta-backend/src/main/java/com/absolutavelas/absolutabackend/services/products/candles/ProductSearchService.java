package com.absolutavelas.absolutabackend.services.products.candles;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductSearchService<T> {
    Page<T> findAll(Pageable pageable);
    Page<T> allOrderedByStockAmountAsc(Pageable pageable);
    Page<T> allOrderedByStockAmountDesc(Pageable pageable);
    Page<T> bestSellers(Pageable pageable);
}