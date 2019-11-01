package com.myproject.accounts.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ExceptionHandlingController {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ErrorMessageStructure handleValidationExceptions(MethodArgumentNotValidException ex) {
        ErrorMessageStructure error = new ErrorMessageStructure();
        error.setTimestamp(LocalDateTime.now().toString());
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setError(HttpStatus.BAD_REQUEST.getReasonPhrase());
        List<String> errorList = new ArrayList<String>();
        for (FieldError errorMessage : ex.getBindingResult().getFieldErrors()) {
            errorList.add(errorMessage.getDefaultMessage());
        }
        error.setMessages(errorList);
        return error;
    }
}
