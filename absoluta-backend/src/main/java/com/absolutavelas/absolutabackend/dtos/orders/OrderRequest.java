package com.absolutavelas.absolutabackend.dtos.orders;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public record OrderRequest(Long amount,
                           BigDecimal subTotal,
                           BigDecimal discount,
                           BigDecimal total,
                           UUID paymentTypeIdentifier,
                           UUID marketplaceIdentifier,
                           List<UUID> productsIdentifiers) {
}