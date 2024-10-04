package br.com.absolutavelas.control_api.services.products.register;

import br.com.absolutavelas.control_api.database.models.Product;
import br.com.absolutavelas.control_api.dtos.products.ProductRequest;

public interface ProductRegisterService {
    Product register(ProductRequest dto);
}