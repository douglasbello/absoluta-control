package br.com.absolutavelas.control_api.dtos.products;

import java.math.BigDecimal;

public record ProductRequest(
        String name,
        BigDecimal price,
        String description,
        boolean isActive,
        long stockAmount,
        Integer flavourId,
        Integer categoryId,
        Integer sizeId
) {
}