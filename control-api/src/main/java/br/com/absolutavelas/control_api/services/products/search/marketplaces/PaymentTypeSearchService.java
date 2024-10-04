package br.com.absolutavelas.control_api.services.products.search.marketplaces;

import br.com.absolutavelas.control_api.database.models.PaymentType;

public interface PaymentTypeSearchService {
    PaymentType findById(Integer id);
}