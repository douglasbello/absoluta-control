package com.absolutavelas.absolutabackend.database.models.orders;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.UUID;

@Embeddable
public class OrderProductId {
    @Column(name = "order_identifier", length = 36)
    private UUID orderIdentifier;
    @Column(name = "product_identifier", length = 36)
    private UUID productIdentifier;

    public OrderProductId() {
    }

    public OrderProductId(UUID orderIdentifier, UUID productIdentifier) {
        this.orderIdentifier = orderIdentifier;
        this.productIdentifier = productIdentifier;
    }

    public UUID getOrderIdentifier() {
        return orderIdentifier;
    }

    public void setOrderIdentifier(UUID orderIdentifier) {
        this.orderIdentifier = orderIdentifier;
    }

    public UUID getProductIdentifier() {
        return productIdentifier;
    }

    public void setProductIdentifier(UUID productIdentifier) {
        this.productIdentifier = productIdentifier;
    }
}