package com.absolutavelas.absolutabackend.database.models.orders;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "identifier", length = 36)
    private UUID identifier;
    @Column(name = "amount")
    private Long amount;
    @Column(name = "sub_total")
    private BigDecimal subTotal;
    @Column(name = "discount")
    private BigDecimal discount;
    @Column(name = "total")
    private BigDecimal total;
    @Column(name = "payment_type_identifier", length = 36)
    private UUID paymentType;
    @Column(name = "marketplace_identifier", length = 36)
    private UUID marketplaceIdentifier;
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Order() {
    }

    public Order(Long amount, BigDecimal subTotal, BigDecimal discount, BigDecimal total, UUID paymentType, UUID marketplaceIdentifier) {
        this.amount = amount;
        this.subTotal = subTotal;
        this.discount = discount;
        this.total = total;
        this.paymentType = paymentType;
        this.marketplaceIdentifier = marketplaceIdentifier;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public UUID getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(UUID paymentType) {
        this.paymentType = paymentType;
    }

    public UUID getMarketplaceIdentifier() {
        return marketplaceIdentifier;
    }

    public void setMarketplaceIdentifier(UUID marketplaceIdentifier) {
        this.marketplaceIdentifier = marketplaceIdentifier;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(identifier, order.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identifier);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Order{");
        sb.append("identifier=").append(identifier);
        sb.append(", amount=").append(amount);
        sb.append(", subTotal=").append(subTotal);
        sb.append(", discount=").append(discount);
        sb.append(", total=").append(total);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", marketplaceIdentifier=").append(marketplaceIdentifier);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append('}');
        return sb.toString();
    }
}