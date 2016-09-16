package com.trinjer.authentication.credentials;


import com.trinjer.authentication.credentials.keeper.LoginKeeper;
import com.trinjer.authentication.credentials.keeper.PasswordKeeper;
import com.trinjer.authentication.credentials.keeper.RolesKeeper;

import java.io.Serializable;
import java.util.Collection;

/**
 *
 * Created by Andrew Tobilko on 26/08/16.
 *
 */
public abstract class Credentials<P extends Serializable, L extends Serializable>
        implements PasswordKeeper<P>, LoginKeeper<L>, RolesKeeper {

    private LoginKeeper<L> loginKeeper;
    private PasswordKeeper<P> passwordKeeper;
    private RolesKeeper rolesKeeper;

    public @Override L getLogin() { return loginKeeper.getLogin(); }
    public @Override P getPassword() { return passwordKeeper.getPassword(); }
    public @Override Collection<Role> getRoles() { return rolesKeeper.getRoles(); }

    public @Override String stringify() {
        return String.join(":", loginKeeper.stringify(), passwordKeeper.stringify(), rolesKeeper.stringify());
    }

}

