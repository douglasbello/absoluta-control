package com.absolutavelas.absolutabackend.controllers.marketplaces.types;

import com.absolutavelas.absolutabackend.database.models.marketplaces.MarketplaceType;
import com.absolutavelas.absolutabackend.dtos.marketplaces.types.MarketplaceTypeRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Marketplace type register endpoints.")
public interface MarketplaceTypeRegisterController {
    @Operation(summary = "Registers Marketplace type.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Returns Marketplace type in body and the URI in header."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<MarketplaceType> register(MarketplaceTypeRequest request);
}