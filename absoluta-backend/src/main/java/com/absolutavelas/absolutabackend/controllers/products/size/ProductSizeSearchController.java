package com.absolutavelas.absolutabackend.controllers.products.size;

import com.absolutavelas.absolutabackend.database.models.products.ProductSize;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

@Tag(name = "Product size search controller")
public interface ProductSizeSearchController {
    @Operation(summary = "Find a product size by it's identifier.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns the product size"),
            @ApiResponse(responseCode = "404", description = "Product size not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<ProductSize> findByIdentifier(UUID identifier);

    @Operation(summary = "Find all product sizes.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns all product sizes in database."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<List<ProductSize>> findAll();
}