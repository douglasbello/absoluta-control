package com.absolutavelas.absolutabackend.controllers.marketplaces.types;

import com.absolutavelas.absolutabackend.database.models.marketplaces.MarketplaceType;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

@Tag(name = "Marketplace type endpoints.")
public interface MarketplaceTypeSearchController {
    @Operation(summary = "Find Marketplace type by identifier")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns Marketplace type found by identifier."),
            @ApiResponse(responseCode = "404", description = "Marketplace type not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<MarketplaceType> findByIdentifier(UUID identifier);

    @Operation(summary = "Finds all Marketplace types.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns all Marketplace types."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<List<MarketplaceType>> findAll();

    @Operation(summary = "Finds all Marketplace types by type name.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns all Marketplace types found by type name."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<List<MarketplaceType>> findByTypeName(String type);
}