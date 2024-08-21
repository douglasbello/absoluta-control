package com.absolutavelas.absolutabackend.database.models.products;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_candles")
public class Candle extends Product {
    @ManyToOne
    @JoinColumn(name = "flavour")
    private CandleFlavour flavour;

    public Candle() {
    }

    public Candle(Builder builder) {
        super(builder);
        this.flavour = builder.flavour;
    }

    public CandleFlavour getFlavour() {
        return flavour;
    }

    public void setFlavour(CandleFlavour flavour) {
        this.flavour = flavour;
    }

    public static final class Builder extends Product.Builder<Candle> {
        private CandleFlavour flavour;

        public Builder flavour(CandleFlavour flavour) {
            this.flavour = flavour;

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
        sb.append("flavour=").append(flavour);
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