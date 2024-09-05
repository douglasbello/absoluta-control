package com.absolutavelas.absolutabackend.controllers.products.flavours;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Flavour register endpoints.")
public interface FlavourRegisterController<T, D> {
    @Operation(summary = "Register flavour.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Flavour registered and returned in body, URI return in the headers."),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<T> register(D request);
}