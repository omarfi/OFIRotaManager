package com.ofi.rotamanager.login.shop;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Omar Farooq Ilyas on 14.06.2015.
 */

@Service
public class LoginShopServiceImpl implements LoginShopService {

    @SuppressWarnings("deprecation")
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        if (s.equals("N852")) {
            List<GrantedAuthority> gas = new ArrayList<>();
            gas.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
            return new User(s, "password", true, true, true, true, gas);
        }
        else throw new UsernameNotFoundException("Butikken finnes ikke");
    }
}
