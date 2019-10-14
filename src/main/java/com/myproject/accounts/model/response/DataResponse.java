package com.myproject.accounts.model.response;

import com.myproject.accounts.model.request.Customer;

public class DataResponse {

    Long customerId;

    public DataResponse(Customer customer) {
        this.customerId = customer.getCustomerId();
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
