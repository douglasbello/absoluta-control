package br.com.absolutavelas.control_api.database.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name", length = 255)
    private String name;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "description", length = 255)
    private String description;
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "stock_amount")
    private long stockAmount;
    @ManyToOne
    @JoinColumn(name = "flavour_id")
    @JsonManagedReference
    private Flavour flavour;
    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonManagedReference
    private ProductCategory category;
    @ManyToOne
    @JoinColumn(name = "size_id")
    @JsonManagedReference
    private ProductSize size;
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public Product() {
    }

    public Product(String name, BigDecimal price, String description, boolean isActive, long stockAmount, Flavour flavour, ProductCategory category, ProductSize size) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.isActive = isActive;
        this.stockAmount = stockAmount;
        this.flavour = flavour;
        this.category = category;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public long getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(long stockAmount) {
        this.stockAmount = stockAmount;
    }

    public Flavour getFlavour() {
        return flavour;
    }

    public void setFlavour(Flavour flavour) {
        this.flavour = flavour;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public ProductSize getSize() {
        return size;
    }

    public void setSize(ProductSize size) {
        this.size = size;
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
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", description='").append(description).append('\'');
        sb.append(", isActive=").append(isActive);
        sb.append(", stockAmount=").append(stockAmount);
        sb.append(", flavour=").append(flavour);
        sb.append(", category=").append(category);
        sb.append(", size=").append(size);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append('}');
        return sb.toString();
    }
}