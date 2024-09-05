package com.absolutavelas.absolutabackend.controllers.orders.paymenttypes;

import com.absolutavelas.absolutabackend.database.models.orders.PaymentType;
import com.absolutavelas.absolutabackend.dtos.orders.PaymentTypeRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Payment type register endpoints.")
public interface PaymentTypeRegisterController {
    @Operation(summary = "Register a payment type.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Registered successfully, entity returned in body and URI returned in header."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<PaymentType> register(PaymentTypeRequest request);
}