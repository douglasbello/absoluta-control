package com.absolutavelas.absolutabackend.database.models.products;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_homesprays")
public class Homespray extends Product {
    @Column(name = "flavour_identifier", length = 36)
    private UUID flavourIdentifier;

    public Homespray() {
    }

    public Homespray(Builder builder) {
        super(builder);
        this.flavourIdentifier = builder.flavourIdentifier;
    }

    public static final class Builder extends Product.Builder<Homespray> {
        private UUID flavourIdentifier;

        public Builder flavour(UUID flavourIdentifier) {
            this.flavourIdentifier = flavourIdentifier;

            return this;
        }

        @Override
        public Homespray build() {
            return new Homespray(this);
        }
    }

    public UUID getFlavourIdentifier() {
        return flavourIdentifier;
    }

    public void setFlavourIdentifier(UUID flavourIdentifier) {
        this.flavourIdentifier = flavourIdentifier;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Homespray{");
        sb.append("flavour=").append(flavourIdentifier);
        sb.append(", identifier=").append(identifier);
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", description='").append(description).append('\'');
        sb.append(", isActive=").append(isActive);
        sb.append(", stockAmount=").append(stockAmount);
        sb.append('}');
        return sb.toString();
    }
}