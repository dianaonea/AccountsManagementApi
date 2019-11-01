package com.myproject.accounts.controller;

import com.myproject.accounts.exceptions.ErrorMessageStructure;
import com.myproject.accounts.model.request.Customer;
import com.myproject.accounts.model.request.RegisterCustomerRequest;
import com.myproject.accounts.model.response.DataResponse;
import com.myproject.accounts.model.response.RegisterCustomerResponse;
import com.myproject.accounts.repository.AccountsRepository;
import com.myproject.accounts.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/account")
public class AccountsController {

    @Autowired
    private AccountsRepository repository;

    @Autowired
    private AccountsService accountsService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    RegisterCustomerResponse registerAccount( @RequestBody @Valid Customer request) {
        return new RegisterCustomerResponse(new DataResponse(accountsService.createRegisterCustomerService(request)));
    }
}
