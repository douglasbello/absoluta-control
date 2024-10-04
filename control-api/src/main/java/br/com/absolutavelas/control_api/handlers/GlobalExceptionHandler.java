package br.com.absolutavelas.control_api.handlers;

import br.com.absolutavelas.control_api.dtos.handler.CustomErrorResponse;
import br.com.absolutavelas.control_api.handlers.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<CustomErrorResponse> handleNotFoundException(NotFoundException ex) {
        CustomErrorResponse error = new CustomErrorResponse();
        error.setError(ex.getMessage());
        error.setStatus(HttpStatus.NOT_FOUND.getReasonPhrase());
        error.setCode(HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}