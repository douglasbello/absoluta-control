package com.absolutavelas.absolutabackend.controllers.marketplaces;

import com.absolutavelas.absolutabackend.database.models.marketplaces.Marketplace;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

@Tag(name = "Marketplace search endpoints.")
public interface MarketplaceSearchController {
    @Operation(summary = "Finds Marketplace by identifier.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns Marketplace found by identifier."),
            @ApiResponse(responseCode = "404", description = "Marketplace not found.", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Marketplace> findByIdentifier(UUID identifier);

    @Operation(summary = "Finds paginated Marketplaces by name.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns paginated Marketplace found by name."),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Page<Marketplace>> findByName(String name, Pageable pageable);

    @Operation(summary = "Find paginated Marketplaces by type.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns paginated Marketplace found by type."),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Page<Marketplace>> findByType(UUID typeIdentifier, Pageable pageable);
}