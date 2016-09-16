package com.trinjer.authentication.credentials.keeper;

import com.trinjer.authentication.credentials.Stringifier;

import java.io.Serializable;

/**
 *
 * Created by Andrew Tobilko on 26/08/16.
 *
 */
public interface LoginKeeper<L extends Serializable> extends Stringifier {

    L getLogin();

    default @Override String stringify() {
        return getLogin().toString();
    }

}
