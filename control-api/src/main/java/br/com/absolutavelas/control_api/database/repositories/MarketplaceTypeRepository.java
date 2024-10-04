package br.com.absolutavelas.control_api.database.repositories;

import br.com.absolutavelas.control_api.database.models.MarketplaceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketplaceTypeRepository extends JpaRepository<MarketplaceType, Integer> {
}