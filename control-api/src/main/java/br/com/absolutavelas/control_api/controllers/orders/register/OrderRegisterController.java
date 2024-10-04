package br.com.absolutavelas.control_api.controllers.orders.register;

import br.com.absolutavelas.control_api.database.models.Order;
import br.com.absolutavelas.control_api.dtos.orders.OrderRequest;
import org.springframework.http.ResponseEntity;

public interface OrderRegisterController {
    ResponseEntity<Order> register(OrderRequest request);
}