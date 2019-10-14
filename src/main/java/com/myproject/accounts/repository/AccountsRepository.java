package com.myproject.accounts.repository;

import com.myproject.accounts.model.request.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Customer, Long> {
}
