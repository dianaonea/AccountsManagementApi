package com.myproject.accounts.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customers")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@SequenceGenerator(name="seq", initialValue=10000000)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id", unique = true, nullable = false)
    Long customerId;

    @Column(name = "admin_name")
    String adminName;

    @NotNull
    //@Pattern(regexp= "[a-zA-Z./ ]{4,60}", message = "Error message for @Pattern annotation :)")
    @Column(name = "country")
    String country;

    //@Email
    @Column(name = "email")
    String email;

    @Column(name = "phone_number")
    String phoneNo;

    @Column(name = "company_name")
    String companyName;

    @Column(name = "tc_accepted")
    boolean isTCAccepted;

    @Column (name = "activation_key")
    String activationKey;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public boolean isTCAccepted() {
        return isTCAccepted;
    }

    public void setTCAccepted(boolean TCAccepted) {
        isTCAccepted = TCAccepted;
    }

    public String getActivationKey() {
        return activationKey;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }
}
