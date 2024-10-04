package br.com.absolutavelas.control_api.services.products.register;

import br.com.absolutavelas.control_api.database.models.ProductSize;

public interface ProductSizeRegisterService {
    ProductSize register(ProductSize size);
}