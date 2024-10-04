package br.com.absolutavelas.control_api.utils.mappers.impl;

import br.com.absolutavelas.control_api.database.models.PaymentType;
import br.com.absolutavelas.control_api.dtos.marketplaces.PaymentTypeRequest;
import br.com.absolutavelas.control_api.utils.mappers.Mapper;
import org.springframework.stereotype.Component;

@Component
public class PaymentTypeMapper implements Mapper<PaymentType, PaymentTypeRequest> {
    @Override
    public PaymentType requestToEntity(PaymentTypeRequest request) {
        return new PaymentType(request.name());
    }
}