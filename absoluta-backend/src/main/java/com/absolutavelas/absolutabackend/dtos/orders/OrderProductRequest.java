package com.absolutavelas.absolutabackend.dtos.orders;

import java.util.UUID;

public record OrderProductRequest(UUID orderIdentifier, UUID productIdentifier) {
}