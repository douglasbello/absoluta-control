package br.com.absolutavelas.control_api.controllers.marketplaces.register;

import br.com.absolutavelas.control_api.database.models.Marketplace;
import br.com.absolutavelas.control_api.dtos.marketplaces.MarketplaceRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Marketplaces")
public interface MarketplaceRegisterController {
    @Operation(summary = "Cadastra um marketplace no banco.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Marketplace cadastrado com sucesso."),
            @ApiResponse(responseCode = "404", description = "Alguma entidade relacionada ao Marketplace não foi encontrada.", content = @Content)
    })
    ResponseEntity<Marketplace> register(MarketplaceRequest request);
}