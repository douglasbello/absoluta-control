package com.absolutavelas.absolutabackend.services.flavours;

import java.util.UUID;

public interface FlavourRegisterService<T> {
    UUID register(T request);
}