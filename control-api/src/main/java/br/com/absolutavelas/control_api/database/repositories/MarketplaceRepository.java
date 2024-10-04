package br.com.absolutavelas.control_api.database.repositories;

import br.com.absolutavelas.control_api.database.models.Marketplace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketplaceRepository extends JpaRepository<Marketplace, Integer> {
}