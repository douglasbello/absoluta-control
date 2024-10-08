package br.com.absolutavelas.control_api.controllers.orders.search;

import br.com.absolutavelas.control_api.database.models.Order;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OrderSearchController {
    ResponseEntity<Order> findById(Integer id);
    ResponseEntity<List<Order>> findAll(Integer marketplaceId, Integer paymentTypeId);
}