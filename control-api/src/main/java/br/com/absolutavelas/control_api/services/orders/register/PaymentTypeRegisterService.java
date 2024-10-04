package br.com.absolutavelas.control_api.services.orders.register;

import br.com.absolutavelas.control_api.database.models.PaymentType;
import br.com.absolutavelas.control_api.dtos.marketplaces.PaymentTypeRequest;

public interface PaymentTypeRegisterService {
    PaymentType register(PaymentTypeRequest request);
}