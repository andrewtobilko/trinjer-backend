package com.trinjer.authentication.credentials.keeper.implementation;

import com.trinjer.authentication.credentials.keeper.RolesKeeper;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Collection;

/**
 *
 * Created by Andrew Tobilko on 28/08/16.
 *
 */
@RequiredArgsConstructor
public class Roles implements RolesKeeper {

    private @NonNull @Getter Collection<Role> roles;

}
