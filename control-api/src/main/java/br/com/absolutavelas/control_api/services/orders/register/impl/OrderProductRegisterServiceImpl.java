package br.com.absolutavelas.control_api.services.orders.register.impl;

import br.com.absolutavelas.control_api.database.models.OrderProduct;
import br.com.absolutavelas.control_api.database.repositories.OrderProductRepository;
import br.com.absolutavelas.control_api.services.orders.register.OrderProductRegisterService;
import org.springframework.stereotype.Service;

@Service
public class OrderProductRegisterServiceImpl implements OrderProductRegisterService {
    private final OrderProductRepository orderProductRepository;

    public OrderProductRegisterServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct register(OrderProduct orderProduct) {
        return orderProductRepository.save(orderProduct);
    }
}