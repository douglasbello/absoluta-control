package br.com.absolutavelas.control_api.controllers.register.products;

import br.com.absolutavelas.control_api.database.models.Product;
import br.com.absolutavelas.control_api.dtos.products.ProductRequest;
import org.springframework.http.ResponseEntity;

public interface ProductRegisterController {
    ResponseEntity<Product> register(ProductRequest request);
}