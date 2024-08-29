package com.absolutavelas.absolutabackend.database.models.orders;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "tb_orders_products")
public class OrderProduct {
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "orderIdentifier", column = @Column(name = "order_identifier", length = 36, columnDefinition = "UUID")),
            @AttributeOverride(name = "productIdentifier", column = @Column(name = "product_identifier", length = 36, columnDefinition = "UUID"))
    })
    private OrderProductId id;
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public OrderProduct() {
    }

    public OrderProduct(OrderProductId id) {
        this.id = id;
    }

    public OrderProduct(UUID orderIdentifier, UUID productIdentifier) {
        this.id = new OrderProductId(orderIdentifier, productIdentifier);
    }

    public OrderProductId getId() {
        return id;
    }

    public void setId(OrderProductId id) {
        this.id = id;
    }

    public UUID getOrderIdentifier() {
        return this.id.getOrderIdentifier();
    }

    public UUID getProductIdentifier() {
        return this.id.getProductIdentifier();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}