package com.absolutavelas.absolutabackend.services.products.flavours;

import java.util.List;
import java.util.UUID;

public interface FlavourSearchService<T> {
    T findByIdentifier(UUID identifier);
    List<T> findByFlavour(String flavour);
}