package com.absolutavelas.absolutabackend.controllers.orders.paymenttypes;

import com.absolutavelas.absolutabackend.database.models.orders.PaymentType;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

@Tag(name = "Payment type search endpoints.")
public interface PaymentTypeSearchController {
    @Operation(summary = "Find payment type by identifier.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Return found payment type."),
            @ApiResponse(responseCode = "404", description = "Payment type not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })

    ResponseEntity<PaymentType> findByIdentifier(UUID identifier);
    @Operation(summary = "Finds all payment types.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns all payment types."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<List<PaymentType>> findAll();
}