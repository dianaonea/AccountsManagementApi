package com.myproject.accounts.service;

import com.myproject.accounts.model.db.Customers;
import com.myproject.accounts.model.request.Customer;

public interface AccountsService {
    Customers createRegisterCustomerService (Customer customerRequest);

}
