package com.absolutavelas.absolutabackend.controllers.products.homesprays;

import com.absolutavelas.absolutabackend.database.models.products.Homespray;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

@Tag(name = "Homespray search endpoints.")
public interface HomespraySearchController {
    @Operation(summary = "Finds homespray by identifier.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns found homespray."),
            @ApiResponse(responseCode = "404", description = "Homespray not found.", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Homespray> findByIdentifier(UUID identifier);

    @Operation(summary = "Finds paginated homesprays.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns paginated homesprays."),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Page<Homespray>> findAll(Pageable pageable);

    @Operation(summary = "Finds paginated homesprays ordered by stock amount ascending.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns paginated homesprays ordered by stock amount ascending."),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Page<Homespray>> allOrderedByStockAmountAsc(Pageable pageable);

    @Operation(summary = "Finds paginated homesprays ordered by stock amount descending.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns paginated homesprays ordered by stock amount descending."),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Page<Homespray>> allOrderedByStockAmountDesc(Pageable pageable);

    @Operation(summary = "Finds paginated homesprays that sell the most.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Returns paginated most sold homesprays."),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = @Content)
    })
    ResponseEntity<Page<Homespray>> bestSellers(Pageable pageable);
}