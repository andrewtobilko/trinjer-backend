package com.trinjer.authentication.credentials.keeper;

import com.trinjer.authentication.credentials.Stringifier;

import java.io.Serializable;

/**
 *
 * Created by Andrew Tobilko on 26/08/16.
 *
 */
public interface PasswordKeeper<P extends Serializable> extends Stringifier {

    P getPassword();

    default @Override String stringify() {
        return getPassword().toString();
    }

}
