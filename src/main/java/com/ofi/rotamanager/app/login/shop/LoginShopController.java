package com.ofi.rotamanager.app.login.shop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class LoginShopController {

    @RequestMapping(value = "/shop")
    public Principal shop(Principal shop) {
        return shop;
    }
}