package me.kktrkkt.designpattern.adapter;

import me.kktrkkt.designpattern.adapter.security.UserDetails;
import me.kktrkkt.designpattern.adapter.security.UserDetailsService;

public class AccountToUserDetailsAdapter implements UserDetailsService {

    private final AccountService accountService;

    public AccountToUserDetailsAdapter(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        UserDetails userDetails = new AccountUserDetails(account);
        return userDetails;
    }
}
