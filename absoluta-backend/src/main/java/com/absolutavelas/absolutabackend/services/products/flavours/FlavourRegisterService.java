package com.absolutavelas.absolutabackend.services.products.flavours;

import java.util.UUID;

public interface FlavourRegisterService<T> {
    UUID register(T request);
}