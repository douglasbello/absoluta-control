package br.com.absolutavelas.control_api.services.products.update;

import br.com.absolutavelas.control_api.database.models.Product;

public interface ProductUpdateService {
    void update(Product update);
}