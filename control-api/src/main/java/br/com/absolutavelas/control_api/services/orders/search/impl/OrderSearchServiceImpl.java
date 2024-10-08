package br.com.absolutavelas.control_api.services.orders.search.impl;

import br.com.absolutavelas.control_api.database.models.Order;
import br.com.absolutavelas.control_api.database.repositories.OrderRepository;
import br.com.absolutavelas.control_api.database.repositories.specifications.OrderSearchSpecification;
import br.com.absolutavelas.control_api.handlers.exceptions.NotFoundException;
import br.com.absolutavelas.control_api.services.orders.search.OrderSearchService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderSearchServiceImpl implements OrderSearchService {
    private final OrderRepository orderRepository;

    public OrderSearchServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order findById(Integer id) {
        return orderRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    @Override
    public List<Order> findAll(Integer marketplaceId, Integer paymentTypeId) {
        Specification<Order> spec = Specification.where(OrderSearchSpecification.hasMarketplace(marketplaceId))
                .and(OrderSearchSpecification.hasPaymentType(paymentTypeId));

        return orderRepository.findAll(spec);
    }
}