package me.kktrkkt.designpattern.adapter;

import me.kktrkkt.designpattern.adapter.security.LoginHandler;
import me.kktrkkt.designpattern.adapter.security.UserDetailsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginHandlerTest {

    @Test
    public void login_test() {
        UserDetailsService userDetailsService = new AccountToUserDetailsAdapter(new AccountService());
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("kktrkkt", "kktrkkt");
        assertEquals("kktrkkt", login);
    }

}
