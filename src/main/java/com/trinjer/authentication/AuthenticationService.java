package com.trinjer.authentication;

import org.springframework.stereotype.Service;

/**
 *
 * Created by Andrew Tobilko on 07/08/16.
 *
 */
@Service
public class AuthenticationService {

    public String logIn(String email, String password) {
        return "token";
    }

    public String signUp(String email, String password, String name) {
        return "token";
    }

}
