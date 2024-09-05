package com.absolutavelas.absolutabackend.controllers.orders;

import com.absolutavelas.absolutabackend.database.models.orders.Order;
import com.absolutavelas.absolutabackend.dtos.orders.OrderRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Order register endpoints.")
public interface OrderRegisterController {
    @Operation(summary = "Register a order.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Returns entity in body and URI in header."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<Order> register(OrderRequest request);
}