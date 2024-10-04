package br.com.absolutavelas.control_api.controllers.products.register;

import br.com.absolutavelas.control_api.database.models.Product;
import br.com.absolutavelas.control_api.dtos.products.ProductRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Produtos")
public interface ProductRegisterController {
    @Operation(summary = "Cadastra um produto no banco.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Produto cadastrado com sucesso.")
    })
    ResponseEntity<Product> register(ProductRequest request);
}