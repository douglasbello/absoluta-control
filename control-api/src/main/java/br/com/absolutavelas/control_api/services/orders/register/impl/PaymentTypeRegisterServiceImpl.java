package br.com.absolutavelas.control_api.services.orders.register.impl;

import br.com.absolutavelas.control_api.database.models.PaymentType;
import br.com.absolutavelas.control_api.database.repositories.PaymentTypeRepository;
import br.com.absolutavelas.control_api.dtos.orders.PaymentTypeRequest;
import br.com.absolutavelas.control_api.services.orders.register.PaymentTypeRegisterService;
import br.com.absolutavelas.control_api.utils.mappers.impl.PaymentTypeMapper;
import org.springframework.stereotype.Service;

@Service
public class PaymentTypeRegisterServiceImpl implements PaymentTypeRegisterService {
    private final PaymentTypeRepository paymentTypeRepository;
    private final PaymentTypeMapper paymentTypeMapper;

    public PaymentTypeRegisterServiceImpl(PaymentTypeRepository paymentTypeRepository, PaymentTypeMapper paymentTypeMapper) {
        this.paymentTypeRepository = paymentTypeRepository;
        this.paymentTypeMapper = paymentTypeMapper;
    }

    @Override
    public PaymentType register(PaymentTypeRequest request) {
        PaymentType type = paymentTypeMapper.requestToEntity(request);

        return paymentTypeRepository.save(type);
    }
}