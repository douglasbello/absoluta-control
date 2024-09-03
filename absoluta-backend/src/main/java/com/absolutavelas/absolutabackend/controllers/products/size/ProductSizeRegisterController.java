package com.absolutavelas.absolutabackend.controllers.products.size;

import com.absolutavelas.absolutabackend.database.models.products.ProductSize;
import com.absolutavelas.absolutabackend.dtos.products.size.ProductSizeRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Product size register controller")
public interface ProductSizeRegisterController {
    @Operation(summary = "Register a product.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Product size registered successfully. Returns the Product size in body and the URI in headers."),
            @ApiResponse(responseCode = "500", description = "Internal Server Error.")
    })
    ResponseEntity<ProductSize> register(ProductSizeRequest request);
}