package com.myproject.accounts.service;

import com.myproject.accounts.model.request.Customer;
import com.myproject.accounts.repository.AccountsRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.logging.Logger;

@Service
public class AccountsServiceImpl implements AccountsService {

    private static final Logger LOGGER = Logger.getLogger( AccountsServiceImpl.class.getName() );

    @Resource
    private AccountsRepository repository;


    @Override
    public Customer createRegisterCustomerService(Customer account) {
        account.setActivationKey(RandomStringUtils.random(50, true, true));
        account.setTCAccepted(false);
        return repository.save(account);
    }
}
