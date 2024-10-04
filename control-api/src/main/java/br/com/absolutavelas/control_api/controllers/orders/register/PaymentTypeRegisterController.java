package br.com.absolutavelas.control_api.controllers.orders.register;

import br.com.absolutavelas.control_api.database.models.PaymentType;
import br.com.absolutavelas.control_api.dtos.marketplaces.PaymentTypeRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Tipos de pagamento.")
public interface PaymentTypeRegisterController {
    @Operation(summary = "Cadastra um tipo de pagamento no banco.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Tipo de pagamento cadastrado com sucesso.")
    })
    ResponseEntity<PaymentType> register(PaymentTypeRequest request);
}