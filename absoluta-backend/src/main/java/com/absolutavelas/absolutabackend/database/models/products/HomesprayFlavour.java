package com.absolutavelas.absolutabackend.database.models.products;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_homespray_flavours")
public class HomesprayFlavour {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "identifier", length = 36, columnDefinition = "UUID")
    private UUID identifier;
    @Column(name = "flavour", length = 50)
    private String flavour;

    public HomesprayFlavour() {
    }

    public HomesprayFlavour(UUID identifier, String flavour) {
        this.identifier = identifier;
        this.flavour = flavour;
    }

    public UUID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(UUID identifier) {
        this.identifier = identifier;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HomesprayFlavour that = (HomesprayFlavour) o;
        return Objects.equals(identifier, that.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identifier);
    }

    @Override
    public String toString() {
        return "HomesprayFlavour{" +
                "identifier=" + identifier +
                ", flavour='" + flavour + '\'' +
                '}';
    }
}