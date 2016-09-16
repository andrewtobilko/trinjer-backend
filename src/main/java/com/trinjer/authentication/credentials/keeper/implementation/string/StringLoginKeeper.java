package com.trinjer.authentication.credentials.keeper.implementation.string;

import com.trinjer.authentication.credentials.keeper.LoginKeeper;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 * Created by Andrew Tobilko on 28/08/16.
 *
 */
@RequiredArgsConstructor
public class StringLoginKeeper implements LoginKeeper<String> {

    private @NonNull @Getter String login;

}
