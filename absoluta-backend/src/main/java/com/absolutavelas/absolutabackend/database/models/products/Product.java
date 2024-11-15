package com.absolutavelas.absolutabackend.database.models.products;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
public abstract class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "identifier", length = 36)
    protected UUID identifier;
    @Column(name = "name", length = 255)
    protected String name;
    @Column(name = "price")
    protected BigDecimal price;
    @Column(name = "description", columnDefinition = "TEXT")
    protected String description;
    @Column(name = "is_active")
    protected Boolean isActive = true;
    @Column(name = "stock_amount")
    protected Long stockAmount;
    @Column(name = "size_identifier", length = 36)
    private UUID sizeIdentifier;
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Product() {
    }

    public Product (Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.isActive = builder.isActive;
        this.stockAmount = builder.stockAmount;
        this.sizeIdentifier = builder.sizeIdentifier;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Long getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(Long stockAmount) {
        this.stockAmount = stockAmount;
    }

    public UUID getSizeIdentifier() {
        return sizeIdentifier;
    }

    public void setSizeIdentifier(UUID sizeIdentifier) {
        this.sizeIdentifier = sizeIdentifier;
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

    public void sale() {
        this.stockAmount--;
    }

    public abstract static class Builder<T extends Product> {
        protected String name;
        protected BigDecimal price;
        protected String description;
        protected Boolean isActive = true;
        protected Long stockAmount;
        protected UUID sizeIdentifier;

        public Builder<T> name(String name) {
            this.name = name;

            return this;
        }

        public Builder<T> price(BigDecimal price) {
            this.price = price;

            return this;
        }

        public Builder<T> description(String description) {
            this.description = description;

            return this;
        }

        public Builder<T> isActive(Boolean isActive) {
            this.isActive = isActive;

            return this;
        }

        public Builder<T> stockAmount(Long stockAmount) {
            this.stockAmount = stockAmount;

            return this;
        }

        public Builder<T> size(UUID sizeIdentifier) {
            this.sizeIdentifier = sizeIdentifier;

            return this;
        }

        public abstract T build();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(identifier, product.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identifier);
    }

    @Override
    public String toString() {
        return "Product{" +
                "identifier=" + identifier +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", isActive=" + isActive +
                ", stockAmount=" + stockAmount +
                '}';
    }
}