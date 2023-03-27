package me.kktrkkt.designpattern.adapter.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
