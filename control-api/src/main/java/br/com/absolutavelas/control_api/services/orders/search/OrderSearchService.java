package br.com.absolutavelas.control_api.services.orders.search;

import br.com.absolutavelas.control_api.database.models.Order;

import java.util.List;

public interface OrderSearchService {
    Order findById(Integer id);
    List<Order> findAll(Integer marketplaceId, Integer paymentTypeId);
}