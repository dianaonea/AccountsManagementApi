package com.myproject.accounts.model.response;

public class RegisterCustomerResponse {
    DataResponse data;

    public RegisterCustomerResponse(DataResponse data) {
        this.data = data;
    }

    public RegisterCustomerResponse() {
    }

    public DataResponse getData() {
        return data;
    }

    public void setData(DataResponse data) {
        this.data = data;
    }
}
