package com.myproject.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = {"com.myproject.accounts"})
@EnableAutoConfiguration
@Configuration
public class AccountsManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountsManagementApplication.class, args);
    }
}
