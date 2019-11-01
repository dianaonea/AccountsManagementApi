package com.myproject.accounts.model.db;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "customers")
@Getter @Setter
@SequenceGenerator(name="seq", initialValue=10000000)
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Column(name = "customer_id", unique = true)
    Long customerId;

    @Column(name = "admin_name")
    String adminName;

    @Column(name = "country")
    String country;

    @Column(name = "email", unique = true)
    String email;

    @Column(name = "phone_number")
    String phoneNo;

    @Column(name = "company_name")
    String companyName;

    @Column(name = "tc_accepted")
    boolean isTCAccepted;

    @Column (name = "activation_key")
    String activationKey;
}
