package br.com.absolutavelas.control_api.handlers.exceptions;

import java.io.Serial;

public class NotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public NotFoundException(Integer id) {
        super("Entity not found with id: " + id);
    }
}