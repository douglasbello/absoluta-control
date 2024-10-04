package br.com.absolutavelas.control_api.controllers.register.products;

import br.com.absolutavelas.control_api.database.models.ProductSize;
import br.com.absolutavelas.control_api.dtos.products.ProductSizeRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Tamanho dos produtos")
public interface ProductSizeRegisterController {
    @Operation(summary = "Cadastra um produto no banco.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Produto cadastrado com sucesso.")
    })
    ResponseEntity<ProductSize> register(ProductSizeRequest request);
}