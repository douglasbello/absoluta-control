package com.absolutavelas.absolutabackend.dtos.products.candles;

import java.math.BigDecimal;
import java.util.UUID;

public record CandleRequest(String name,
                            BigDecimal price,
                            String description,
                            Boolean isActive,
                            Long stockAmount,
                            UUID flavour) {
}