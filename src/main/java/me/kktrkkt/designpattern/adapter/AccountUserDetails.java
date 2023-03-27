package me.kktrkkt.designpattern.adapter;

import me.kktrkkt.designpattern.adapter.security.UserDetails;

public class AccountUserDetails implements UserDetails {
    private final Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
