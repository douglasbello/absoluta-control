package br.com.absolutavelas.control_api.database.repositories;

import br.com.absolutavelas.control_api.database.models.PaymentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentTypeRepository extends JpaRepository<PaymentType, Integer> {
}