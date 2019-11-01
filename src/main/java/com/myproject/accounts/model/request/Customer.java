package com.myproject.accounts.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter @Setter
public class Customer {


    @Pattern(regexp= "[a-zA-Z.-/ ]{4,100}", message = "The administrator name (adminName) is not valid.")
    String adminName;

    @Pattern(regexp= "[a-zA-Z./ ]{4,60}", message = "The country name (country) is not valid.")
    String country;

    @Email (message = "The email address (email) is not valid.")
    //@Pattern(regexp="[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}")
    String email;

    String phoneNo;

    @Pattern(regexp= "[a-zA-Z.-/ ]{4,60}", message = "The company name (companyName) is not valid.")
    String companyName;
}
