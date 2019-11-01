package com.myproject.accounts.model.response;

import com.myproject.accounts.model.db.Customers;
import com.myproject.accounts.model.request.Customer;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DataResponse {

    Long customerId;

    public DataResponse(Customers customer) {
        this.customerId = customer.getCustomerId();
    }
}
