package br.com.absolutavelas.control_api.controllers.marketplaces.register;

import br.com.absolutavelas.control_api.database.models.MarketplaceType;
import br.com.absolutavelas.control_api.dtos.marketplaces.MarketplaceTypeRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Tipos de marketplace")
public interface MarketplaceTypeRegisterController {
    @Operation(summary = "Cadastra um tipo de marketplace no banco.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Tipo de marketplace cadastrado com sucesso.")
    })
    ResponseEntity<MarketplaceType> register(MarketplaceTypeRequest request);
}