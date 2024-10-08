package br.com.absolutavelas.control_api.controllers.orders.search.impl;

import br.com.absolutavelas.control_api.controllers.orders.search.OrderSearchController;
import br.com.absolutavelas.control_api.database.models.Order;
import br.com.absolutavelas.control_api.services.orders.search.OrderSearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderSearchControllerImpl implements OrderSearchController {
    private final OrderSearchService orderSearchService;

    public OrderSearchControllerImpl(OrderSearchService orderSearchService) {
        this.orderSearchService = orderSearchService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(orderSearchService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Order>> findAll(@RequestParam(required = false) Integer marketplaceId, @RequestParam(required = false) Integer paymentTypeId) {
        return ResponseEntity.ok().body(orderSearchService.findAll(marketplaceId, paymentTypeId));
    }
}