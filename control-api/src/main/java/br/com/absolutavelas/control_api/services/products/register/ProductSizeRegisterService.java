package br.com.absolutavelas.control_api.services.products.register;

import br.com.absolutavelas.control_api.database.models.ProductSize;
import br.com.absolutavelas.control_api.dtos.products.ProductSizeRequest;

public interface ProductSizeRegisterService {
    ProductSize register(ProductSizeRequest request);
}