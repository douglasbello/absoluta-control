package com.absolutavelas.absolutabackend.controllers.marketplaces;

import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import com.absolutavelas.absolutabackend.dtos.marketplaces.MarketplaceRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Marketplace register endpoints.")
public interface MarketplaceRegisterController {
    @Operation(summary = "Register a Marketplace.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Returns the Marketplace in body and URI in the header."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<Marketplace> register(MarketplaceRequest request);
}