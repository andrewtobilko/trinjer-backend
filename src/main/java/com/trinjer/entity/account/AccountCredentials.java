package com.trinjer.entity.account;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 *
 * Created by Andrew Tobilko on 07/08/16.
 *
 */
@Data
@RequiredArgsConstructor
public class AccountCredentials<Login extends Serializable, Password extends Serializable> implements UserDetails {

    private @NonNull Login login;
    private @NonNull Password password;
    private @NonNull List<? extends GrantedAuthority> authorities;

    public @Override @NonNull Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public @Override String getPassword() { return ""; }
    public @Override String getUsername() { return ""; }

    public @Override boolean isAccountNonExpired() { return true; }
    public @Override boolean isAccountNonLocked() { return true; }
    public @Override boolean isCredentialsNonExpired() { return true; }
    public @Override boolean isEnabled() { return true; }

}
