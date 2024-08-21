package com.absolutavelas.absolutabackend.database.models.products;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_homesprays")
public class Homespray extends Product {
    @ManyToOne
    @JoinColumn(name = "flavour")
    private HomesprayFlavour flavour;

    public Homespray() {
    }

    public Homespray(Builder builder) {
        super(builder);
        this.flavour = builder.flavour;
    }

    public static final class Builder extends Product.Builder<Homespray> {
        private HomesprayFlavour flavour;

        public Builder flavour(HomesprayFlavour flavour) {
            this.flavour = flavour;

            return this;
        }

        @Override
        public Homespray build() {
            return new Homespray(this);
        }
    }

    public HomesprayFlavour getFlavour() {
        return flavour;
    }

    public void setFlavour(HomesprayFlavour flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Homespray{");
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