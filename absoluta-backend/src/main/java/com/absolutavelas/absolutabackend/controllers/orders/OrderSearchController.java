package com.absolutavelas.absolutabackend.controllers.orders;

import com.absolutavelas.absolutabackend.database.models.orders.Order;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

@Tag(name = "Order search endpoints.")
public interface OrderSearchController {
    @Operation(summary = "Find order by identifier.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Return order found."),
            @ApiResponse(responseCode = "404", description = "Order not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<Order> findByIdentifier(UUID identifier);

    @Operation(summary = "Finds all paginated orders.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Return orders paginated."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    ResponseEntity<Page<Order>> findAll(Pageable pageable);
}