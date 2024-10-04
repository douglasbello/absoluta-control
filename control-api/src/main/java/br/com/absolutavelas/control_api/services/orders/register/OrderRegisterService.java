package br.com.absolutavelas.control_api.services.orders.register;

import br.com.absolutavelas.control_api.database.models.Order;
import br.com.absolutavelas.control_api.dtos.orders.OrderRequest;

public interface OrderRegisterService {
    Order register(OrderRequest request);
}