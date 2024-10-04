package br.com.absolutavelas.control_api.services.orders.register;

import br.com.absolutavelas.control_api.database.models.OrderProduct;

public interface OrderProductRegisterService {
    OrderProduct register(OrderProduct orderProduct);
}