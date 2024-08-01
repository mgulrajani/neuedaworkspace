package com.training.payments_application.aspects;


import com.training.payments_application.entities.ErrorMessage;
import com.training.payments_application.exceptions.BookNotFoundException;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//AOP
//Aspect Oriented Programming

//OOP -
@ControllerAdvice  // class level it is a global exception handler for  your application
public class BookAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<ErrorMessage> bookNotFound(BookNotFoundException bnf , WebRequest request){
       ErrorMessage msg = new ErrorMessage(HttpStatus.NOT_FOUND,bnf.getMessage());
        return new ResponseEntity<>(msg, HttpStatus.NOT_FOUND);

    }




}
