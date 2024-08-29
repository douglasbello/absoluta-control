package com.absolutavelas.absolutabackend.controllers.orders.paymenttypes.impl;

import com.absolutavelas.absolutabackend.controllers.orders.paymenttypes.PaymentTypeSearchController;
import com.absolutavelas.absolutabackend.database.models.orders.PaymentType;
import com.absolutavelas.absolutabackend.services.orders.PaymentTypeSearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orders/payments/types")
public class PaymentTypeSearchControllerImpl implements PaymentTypeSearchController {
    private final PaymentTypeSearchService paymentTypeSearchService;

    public PaymentTypeSearchControllerImpl(PaymentTypeSearchService paymentTypeSearchService) {
        this.paymentTypeSearchService = paymentTypeSearchService;
    }

    @GetMapping("/{identifier}")
    public ResponseEntity<PaymentType> findByIdentifier(@PathVariable UUID identifier) {
        return ResponseEntity.ok().body(paymentTypeSearchService.findByIdentifier(identifier));
    }

    @GetMapping
    public ResponseEntity<List<PaymentType>> findAll() {
        return ResponseEntity.ok().body(paymentTypeSearchService.findAll());
    }
}