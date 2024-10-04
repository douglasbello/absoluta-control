package br.com.absolutavelas.control_api.controllers.orders.register.impl;

import br.com.absolutavelas.control_api.controllers.orders.register.OrderRegisterController;
import br.com.absolutavelas.control_api.database.models.Order;
import br.com.absolutavelas.control_api.dtos.orders.OrderRequest;
import br.com.absolutavelas.control_api.services.orders.register.OrderRegisterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/orders")
public class OrderRegisterControllerImpl implements OrderRegisterController {
    private final OrderRegisterService orderRegisterService;

    public OrderRegisterControllerImpl(OrderRegisterService orderRegisterService) {
        this.orderRegisterService = orderRegisterService;
    }

    @PostMapping
    public ResponseEntity<Order> register(@RequestBody OrderRequest request) {
        Order created = orderRegisterService.register(request);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(created.getId()).toUri();

        return ResponseEntity.created(uri).body(created);
    }
}