package br.com.absolutavelas.control_api.dtos.orders;

import java.math.BigDecimal;
import java.util.List;

public record OrderRequest(
        BigDecimal discount,
        Integer marketplaceId,
        Integer paymentTypeId,
        List<ProductAmountRequest> productAmounts
) {
}