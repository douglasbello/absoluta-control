package br.com.absolutavelas.control_api.database.repositories;

import br.com.absolutavelas.control_api.database.models.OrderProduct;
import br.com.absolutavelas.control_api.database.models.pk.OrderProductId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct, OrderProductId> {
}