package com.training.payments_application.aspects;

import com.training.payments_application.entities.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Aspect

//cross cutting concern
public class LoggingAspect {

    //advice --any method which you write in Aspect  --5 times before after around afterreturning afterthrowing
    //Pointcut is the expression that which methods are to be advised

    //JoinPoint  is the encapsulated object which is th method itself which is advised -- repo.findByTitle

private final Logger logger = LoggerFactory.getLogger((this.getClass()));

@Before(value="(execution(* com.training.payments_application.control.BookController.addABook(..)))")
    public void adviceBeforeAddingABook(JoinPoint jp){

    logger.info("started add book"+jp.getSignature()+ " "+ LocalDate.now());

}
    @After(value="(execution(* com.training.payments_application.control.BookController.addABook(..)))")
    public void adviceAfterAddingTheBook(JoinPoint jp){

        logger.info(" added the book book"+jp.getSignature()+ " "+ LocalDate.now());

    }

    @AfterReturning(value="(execution(* com.training.payments_application.services.BookServiceImpl.findBook(..)))",returning = "book")

    public void afterReturningBookFind(JoinPoint jp , Book book){

    logger.info("Returning book "+ book );


    }
    @AfterThrowing(value="(execution(* com.training.payments_application.services.BookServiceImpl.findBook(..)))",throwing = "exception")

    public void afterThrowingException(JoinPoint jp , Exception  exception){

        logger.error("Fetch failed  "+ exception );


    }

}
