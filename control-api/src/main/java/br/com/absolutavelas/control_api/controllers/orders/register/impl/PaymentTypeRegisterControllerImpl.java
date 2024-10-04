package br.com.absolutavelas.control_api.controllers.orders.register.impl;

import br.com.absolutavelas.control_api.controllers.orders.register.PaymentTypeRegisterController;
import br.com.absolutavelas.control_api.database.models.PaymentType;
import br.com.absolutavelas.control_api.dtos.marketplaces.PaymentTypeRequest;
import br.com.absolutavelas.control_api.services.orders.register.PaymentTypeRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/payment/types")
public class PaymentTypeRegisterControllerImpl implements PaymentTypeRegisterController {
    private final PaymentTypeRegisterService paymentTypeRegisterService;

    public PaymentTypeRegisterControllerImpl(PaymentTypeRegisterService paymentTypeRegisterService) {
        this.paymentTypeRegisterService = paymentTypeRegisterService;
    }

    @PostMapping
    public ResponseEntity<PaymentType> register(@RequestBody PaymentTypeRequest request) {
        PaymentType created = paymentTypeRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(created.getId()).toUri();

        return ResponseEntity.created(uri).body(created);
    }
}