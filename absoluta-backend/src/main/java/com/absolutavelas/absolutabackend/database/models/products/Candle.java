package com.absolutavelas.absolutabackend.database.models.products;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "tb_candles")
public class Candle extends Product {
    private UUID flavourIdentifier;

    public Candle() {
    }

    public Candle(Builder builder) {
        super(builder);
        this.flavourIdentifier = builder.flavourIdentifier;
    }

    public UUID getFlavourIdentifier() {
        return flavourIdentifier;
    }

    public void setFlavourIdentifier(UUID flavourIdentifier) {
        this.flavourIdentifier = flavourIdentifier;
    }

    public static final class Builder extends Product.Builder<Candle> {
        private UUID flavourIdentifier;

        public Builder flavour(UUID flavourIdentifier) {
            this.flavourIdentifier = flavourIdentifier;

            return this;
        }

        @Override
        public Candle build() {
            return new Candle(this);
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Candle{");
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