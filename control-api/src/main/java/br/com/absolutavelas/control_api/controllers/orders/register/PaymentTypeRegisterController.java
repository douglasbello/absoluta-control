package br.com.absolutavelas.control_api.controllers.register.marketplaces.register;

import br.com.absolutavelas.control_api.database.models.PaymentType;
import br.com.absolutavelas.control_api.dtos.marketplaces.PaymentTypeRequest;
import org.springframework.http.ResponseEntity;

public interface PaymentTypeRegisterController {
    ResponseEntity<PaymentType> register(PaymentTypeRequest request);
}