package com.myproject.accounts.service;

import com.myproject.accounts.model.db.Customers;
import com.myproject.accounts.model.request.Customer;
import com.myproject.accounts.repository.AccountsRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.logging.Logger;

@Service
public class AccountsServiceImpl implements AccountsService {

    private static final Logger LOGGER = Logger.getLogger( AccountsServiceImpl.class.getName() );

    @Resource
    private AccountsRepository repository;


    @Override
    public Customers createRegisterCustomerService(Customer account) {

        Customers dbCustomerEntry = new Customers();
        dbCustomerEntry.setAdminName(account.getAdminName());
        dbCustomerEntry.setCountry(account.getCountry());
        dbCustomerEntry.setEmail(account.getEmail());
        dbCustomerEntry.setCompanyName(account.getCompanyName());
        dbCustomerEntry.setPhoneNo(account.getPhoneNo());
        dbCustomerEntry.setActivationKey(RandomStringUtils.random(50, true, true));
        dbCustomerEntry.setTCAccepted(false);
        return repository.save(dbCustomerEntry);
    }
}
