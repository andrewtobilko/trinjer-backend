package com.trinjer;

import com.trinjer.entity.account.Account;
import com.trinjer.entity.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static org.springframework.boot.SpringApplication.run;

/**
 *
 * Created by Andrew Tobilko on 27/07/16.
 *
 */
@SpringBootApplication
public class Bootstrapper {

    public static void main(String[] args) { run(Bootstrapper.class, args); }

    @Autowired
            private
    AccountRepository repository;

    @Bean
    public ApplicationRunner runner() {
        return (arguments) -> {
            repository.save(new Account());
            repository.save(new Account());
            repository.save(new Account());
            repository.save(new Account());
            repository.save(new Account());
        };
    }

}
