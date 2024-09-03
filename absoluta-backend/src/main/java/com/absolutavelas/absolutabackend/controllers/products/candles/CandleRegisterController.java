package com.absolutavelas.absolutabackend.controllers.products.candles;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import com.absolutavelas.absolutabackend.dtos.products.candles.CandleRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Candle register endpoints.")
public interface CandleRegisterController {
    @Operation(summary = "Registers candle.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Candle registered and returned in body, URI returned in the headers."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<Candle> register(CandleRequest request);
}