package com.trinjer.authentication;

import com.trinjer.entity.account.AccountCredentials;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Service;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * Created by Andrew Tobilko on 10/08/16.
 *
 */
@Service
public class AuthenticationReader {

    private @Value("${app.authentication.headerType}") String HEADER;
    private @NonNull TokenAuthenticationService<Token<String>> service;

    public Authentication getAuthenticationFromRequest(ServletRequest originRequest) {

        HttpServletRequest request = (HttpServletRequest)originRequest;
        String value = request.getHeader(HEADER);
        AccountCredentials credentials = service.getAccountFromToken(Token.of(value));
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(credentials, credentials.getPassword(),  credentials.getAuthorities());

        token.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

        return token;
    }

}
