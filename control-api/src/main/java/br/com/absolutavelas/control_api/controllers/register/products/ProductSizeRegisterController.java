package br.com.absolutavelas.control_api.controllers.register.products;

import br.com.absolutavelas.control_api.database.models.ProductSize;
import br.com.absolutavelas.control_api.dtos.products.ProductSizeRequest;
import org.springframework.http.ResponseEntity;

public interface ProductSizeRegisterController {
    ResponseEntity<ProductSize> register(ProductSizeRequest request);
}