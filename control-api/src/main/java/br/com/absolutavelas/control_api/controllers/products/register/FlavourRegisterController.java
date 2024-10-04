package br.com.absolutavelas.control_api.controllers.products.register;

import br.com.absolutavelas.control_api.database.models.Flavour;
import br.com.absolutavelas.control_api.dtos.products.FlavourRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Aromas")
public interface FlavourRegisterController {
    @Operation(summary = "Recebe um DTO, transforma em entidade e salva no banco.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Aroma cadastrado com sucesso.")
    })
    ResponseEntity<Flavour> register(FlavourRequest request);
}