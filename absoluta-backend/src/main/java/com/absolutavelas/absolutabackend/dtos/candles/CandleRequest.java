package com.absolutavelas.absolutabackend.dtos.candles;

import java.math.BigDecimal;
import java.util.UUID;

public record CandleRequest(UUID identifier,
                            String name,
                            BigDecimal price,
                            String description,
                            Boolean isActive,
                            Long stockAmount) {
}