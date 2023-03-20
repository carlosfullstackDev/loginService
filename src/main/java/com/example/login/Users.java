package com.example.login;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class Users implements UserDetails {
    private String userName;
    private String password;
    private List<GrantedAuthority> grantedAuthorityList;
    private boolean accessToRestrictedPolicy;

    public static Users builder() {
        return new Users();
    }

    public Users withAccessToRestrictedPolicy(boolean restrictedPolicy) {
        this.accessToRestrictedPolicy = restrictedPolicy;
        return this;
    }

    public boolean hasAccessToRestrictedPolicy() {
        return accessToRestrictedPolicy;
    }

    public Users withGrantedAuthorityList(List<GrantedAuthority> grantedAuthorityList) {
        this.grantedAuthorityList = grantedAuthorityList;
        return this;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.grantedAuthorityList;
    }

    public Users withPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    public Users withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}