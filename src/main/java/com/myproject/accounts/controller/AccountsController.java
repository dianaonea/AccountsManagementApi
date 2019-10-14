package com.myproject.accounts.controller;

import com.myproject.accounts.model.request.RegisterCustomerRequest;
import com.myproject.accounts.model.response.DataResponse;
import com.myproject.accounts.model.response.RegisterCustomerResponse;
import com.myproject.accounts.repository.AccountsRepository;
import com.myproject.accounts.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/account")
public class AccountsController {

    @Autowired
    private AccountsRepository repository;

    @Autowired
    private AccountsService accountsService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    RegisterCustomerResponse registerAccount( @RequestBody RegisterCustomerRequest request) {
        return new RegisterCustomerResponse(new DataResponse(accountsService.createRegisterCustomerService(request.getCustomer())));
    }
}
