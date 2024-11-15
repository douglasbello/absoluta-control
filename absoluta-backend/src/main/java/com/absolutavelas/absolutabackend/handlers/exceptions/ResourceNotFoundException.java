package com.absolutavelas.absolutabackend.handlers.exceptions;

import java.io.Serial;
import java.util.UUID;

public class ResourceNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String resourceName, UUID identifier) {
        super(resourceName + " not found with identifier: " + identifier);
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}