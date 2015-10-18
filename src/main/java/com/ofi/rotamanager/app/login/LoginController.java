package com.ofi.rotamanager.app.login;

import com.ofi.rotamanager.app.shop.Shop;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class LoginController {

    @RequestMapping(value = "/rest/shop")
    public Principal shop(Principal shop) {
        return shop;
    }

    /*@RequestMapping(value = "/rest/shop", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Shop> getShop() {
        System.out.println("GOT HERE");
        Shop shop = new Shop("N852");
        return new ResponseEntity<>(shop, HttpStatus.OK);
    }*/
}