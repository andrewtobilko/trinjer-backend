package com.trinjer.authentication;

import com.trinjer.entity.account.AccountCredentials;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 *
 * Created by Andrew Tobilko on 08/08/16.
 *
 */
@Service
public class TokenAuthenticationService<Token extends Serializable> {

    public Token createTokenFromAccountCredentials(AccountCredentials credentials) {
        return null;
    }

    public AccountCredentials getAccountFromToken(Token token) {
        return null;
    }

}
