package br.com.absolutavelas.control_api.controllers.orders.register;

import br.com.absolutavelas.control_api.database.models.Order;
import br.com.absolutavelas.control_api.dtos.orders.OrderRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Pedidos")
public interface OrderRegisterController {
    @Operation(summary = "Recebe um OrderRequest (DTO) converte em entidade e cadastra no banco.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Pedido cadastrado com sucesso.")
    })
    ResponseEntity<Order> register(OrderRequest request);
}