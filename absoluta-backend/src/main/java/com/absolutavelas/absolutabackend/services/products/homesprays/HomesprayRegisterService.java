package com.absolutavelas.absolutabackend.services.products.homesprays;

import com.absolutavelas.absolutabackend.dtos.homesprays.HomesprayRequest;

import java.util.UUID;

public interface HomesprayRegisterService {
    UUID register(HomesprayRequest request);
}
