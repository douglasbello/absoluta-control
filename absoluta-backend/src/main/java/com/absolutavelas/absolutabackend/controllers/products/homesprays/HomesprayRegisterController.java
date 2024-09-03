package com.absolutavelas.absolutabackend.controllers.products.homesprays;

import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import com.absolutavelas.absolutabackend.dtos.products.homesprays.HomesprayRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Homespray register endpoints.")
public interface HomesprayRegisterController {
    @Operation(summary = "Registers homespray.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Returns homespray in the body and URI in the header."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<Homespray> register(HomesprayRequest request);
}