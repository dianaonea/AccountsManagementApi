package com.myproject.accounts.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.RollbackException;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;


@RestControllerAdvice
public class MyExceptionHandler {
/*    @ExceptionHandler(RollbackException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public String handleRollbackException(RollbackException ex) {

        String errorMessage = "Your custom message";
        return errorMessage ;
    }*/
/*
    Logger LOGGER = LoggerFactory.getLogger(MyExceptionHandler.class);

    @ExceptionHandler(value = { TransactionSystemException.class })
    protected ResponseEntity<Object> handleConflict(TransactionSystemException ex, WebRequest request) {
        LOGGER.error("Caught", ex);
        Throwable cause = ex.getRootCause();

        if (cause instanceof ConstraintViolationException) {
            Set<ConstraintViolation<?>> constraintViolations = ((ConstraintViolationException) cause).getConstraintViolations();
            // iterate the violations to create your JSON user friendly message
            String msg = "mesaj din exception handler";
            return handleExceptionInternal(ex, msg, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
        } else return null;
    }*/
}
