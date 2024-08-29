package com.absolutavelas.absolutabackend.controllers.orders.paymenttypes.impl;

import com.absolutavelas.absolutabackend.controllers.orders.paymenttypes.PaymentTypeRegisterController;
import com.absolutavelas.absolutabackend.database.models.orders.PaymentType;
import com.absolutavelas.absolutabackend.dtos.orders.PaymentTypeRequest;
import com.absolutavelas.absolutabackend.services.orders.PaymentTypeRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/orders/payments/types")
public class PaymentTypeRegisterControllerImpl implements PaymentTypeRegisterController {
    private final PaymentTypeRegisterService paymentTypeRegisterService;

    public PaymentTypeRegisterControllerImpl(PaymentTypeRegisterService paymentTypeRegisterService) {
        this.paymentTypeRegisterService = paymentTypeRegisterService;
    }

    @PostMapping
    public ResponseEntity<PaymentType> register(@RequestBody PaymentTypeRequest request) {
        PaymentType type = paymentTypeRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{identifier}").buildAndExpand(type.getIdentifier()).toUri();

        return ResponseEntity.created(uri).body(type);
    }
}