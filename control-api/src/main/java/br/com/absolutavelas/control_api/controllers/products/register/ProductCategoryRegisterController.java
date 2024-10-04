package br.com.absolutavelas.control_api.controllers.products.register;

import br.com.absolutavelas.control_api.database.models.ProductCategory;
import br.com.absolutavelas.control_api.dtos.products.ProductCategoryRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Categorias")
public interface ProductCategoryRegisterController {
    @Operation(summary = "Cadastra uma categoria de produto no banco.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Categoria cadastrada com sucesso.")
    })
    ResponseEntity<ProductCategory> register(ProductCategoryRequest request);
}