package com.veeha.openid.oidc.jwtauthorities.config;

import java.util.Collection;

import com.veeha.openid.oidc.jwtauthorities.domain.Account;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

public class AccountToken extends JwtAuthenticationToken {
    private static final long serialVersionUID = 1L;
    private final Account account;

    public AccountToken(Jwt jwt, Collection<? extends GrantedAuthority> authorities, String name, Account account) {
        super(jwt, authorities, name);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}
