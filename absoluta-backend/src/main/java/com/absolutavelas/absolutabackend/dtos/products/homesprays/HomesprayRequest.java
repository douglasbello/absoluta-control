package com.absolutavelas.absolutabackend.dtos.products.homesprays;

import java.math.BigDecimal;
import java.util.UUID;

public record HomesprayRequest(String name,
                               BigDecimal price,
                               String description,
                               Boolean isActive,
                               Long stockAmount,
                               UUID size,
                               UUID flavour) {
}