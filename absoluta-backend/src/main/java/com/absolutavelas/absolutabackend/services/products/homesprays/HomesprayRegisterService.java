package com.absolutavelas.absolutabackend.services.products.homesprays;

import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import com.absolutavelas.absolutabackend.dtos.products.homesprays.HomesprayRequest;

import java.util.UUID;

public interface HomesprayRegisterService {
    Homespray register(HomesprayRequest request);
}
