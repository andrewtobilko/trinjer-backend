package com.trinjer.authentication.credentials.keeper;

import com.trinjer.authentication.credentials.Stringifier;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 *
 * Created by Andrew Tobilko on 27/08/16.
 *
 */
public interface RolesKeeper extends Stringifier {

    @RequiredArgsConstructor
    enum Role implements Stringifier {
        ADMIN("ADMIN"), USER("USER");

        private @NonNull String value;
        public @Override String stringify() { return value; }

    }

    Collection<Role> getRoles();

    default @Override String stringify() {
        return getRoles().stream().map(Role::stringify).collect(Collectors.joining(","));
    }

}

