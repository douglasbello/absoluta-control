package com.absolutavelas.absolutabackend.controllers.products.candles;

import com.absolutavelas.absolutabackend.database.models.products.Candle;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

@Tag(name = "Candle search endpoints.")
public interface CandleSearchController {
    @Operation(summary = "Find candle by identifier.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns found candle."),
            @ApiResponse(responseCode = "404", description = "Candle not found.", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Candle> findByIdentifier(UUID identifier);

    @Operation(summary = "Finds paginated amount of candles.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns paginated amount of candles."),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Page<Candle>> findAll(Pageable pageable);

    @Operation(summary = "Finds paginated amount of candles ordered by stock amount ascending.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns paginated amount of candles ordered by stock amount ascending."),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Page<Candle>> allOrderedByStockAmountAsc(Pageable pageable);

    @Operation(summary = "Finds paginated amount of candles ordered by stock amount descending.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns paginated amount of candles ordered by stock amount descending."),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Page<Candle>> allOrderedByStockAmountDesc(Pageable pageable);

    @Operation(summary = "Finds the candles that sells the most.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns all most sold candles."),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Page<Candle>> bestSellers(Pageable pageable);
}