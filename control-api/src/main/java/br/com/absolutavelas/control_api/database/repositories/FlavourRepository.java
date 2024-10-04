package br.com.absolutavelas.control_api.database.repositories;

import br.com.absolutavelas.control_api.database.models.Flavour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlavourRepository extends JpaRepository<Flavour, Integer> {
}