package com.trinjer.authentication;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;
import static org.springframework.security.core.context.SecurityContextHolder.getContext;

/**
 *
 * Created by Andrew Tobilko on 08/08/16.
 *
 */
@Component
@Order(HIGHEST_PRECEDENCE)
@RequiredArgsConstructor
public class StatelessAuthenticationFilter extends GenericFilterBean {

    private @NonNull AuthenticationReader service;

    public @Override void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        getContext().setAuthentication(service.getAuthenticationFromRequest(request));
        chain.doFilter(request, response);
        getContext().setAuthentication(null);

    }

}
