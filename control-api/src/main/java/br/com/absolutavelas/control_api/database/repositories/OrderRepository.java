package br.com.absolutavelas.control_api.database.repositories;

import br.com.absolutavelas.control_api.database.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}