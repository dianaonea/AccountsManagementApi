package com.myproject.accounts.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
public class ErrorMessageStructure {
    String timestamp;
    int status;
    String error;
    List<String> messages;
}
