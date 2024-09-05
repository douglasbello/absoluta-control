package com.absolutavelas.absolutabackend.controllers.products.flavours;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

@Tag(name = "Products flavours endpoint.")
public interface FlavourSearchController<T> {
    @Operation(summary = "Finds flavour by identifier.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns flavour."),
            @ApiResponse(responseCode = "404", description = "Flavour not found.", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<T> findByIdentifier(UUID identifier);

    @Operation(summary = "Find flavours by flavour name.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns list of flavours found by name."),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<List<T>> findByFlavour(String flavour);
}