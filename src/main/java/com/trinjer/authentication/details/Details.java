package com.trinjer.authentication.details;

import com.trinjer.authentication.credentials.keeper.RolesKeeper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

import static com.trinjer.authentication.credentials.keeper.RolesKeeper.*;
import static org.springframework.security.core.authority.AuthorityUtils.createAuthorityList;

/**
 *
 * Created by Andrew Tobilko on 27/08/16.
 *
 */
public interface Details extends UserDetails {

    String getLogin();
    Collection<RolesKeeper.Role> getRoles();

    default @Override Collection<? extends GrantedAuthority> getAuthorities() {
        return createAuthorityList(getRoles().stream().map(Role::stringify).toArray(String[]::new));
    }
    default @Override String getUsername() { return getLogin(); }
    default @Override boolean isAccountNonExpired() { return true; }
    default @Override boolean isAccountNonLocked() { return true; }
    default @Override boolean isCredentialsNonExpired() { return true; }
    default @Override boolean isEnabled() { return true; }

}


