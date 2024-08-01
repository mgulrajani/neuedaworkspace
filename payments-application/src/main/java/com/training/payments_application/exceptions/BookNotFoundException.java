package com.training.payments_application.exceptions;

import org.springframework.stereotype.Component;

@Component
public class BookNotFoundException extends Exception {
private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public BookNotFoundException() {
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BookNotFoundException(String message) {
       this.message = message;
    }
}
