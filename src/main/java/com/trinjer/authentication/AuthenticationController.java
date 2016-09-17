package com.trinjer.authentication;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 *
 * Created by Andrew Tobilko on 27/07/16.
 *
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AuthenticationController {

    private @NonNull AuthenticationService service;

    @RequestMapping(path = "login", method = POST, produces = TEXT_PLAIN_VALUE)
    @ResponseStatus(OK)
    public String logIn(@RequestParam String email, @RequestParam String password) {
        return service.logIn(email, password);
    }

    @RequestMapping(path = "signup", method = POST, produces = TEXT_PLAIN_VALUE)
    @ResponseStatus(CREATED)
    public String signUp(@RequestParam String email, @RequestParam String password, @RequestParam String name) {
        return service.signUp(email, password, name);
    }

}