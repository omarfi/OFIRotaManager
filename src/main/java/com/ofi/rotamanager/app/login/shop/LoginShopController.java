package com.ofi.rotamanager.app.login.shop;

import com.ofi.rotamanager.app.shop.Shop;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class LoginShopController {

    @RequestMapping(value = "/shop")
    public Principal shop(Principal shop) {
        return shop;
    }

    @RequestMapping(value = "/test")
    public Shop test() {
        return new Shop("testId");
    }

    /*@RequestMapping(value = "/shop")
    public Shop shop() {
        return new Shop("N852");
    }*/

    /*@RequestMapping(value = "/shop", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Shop> getShop() {
        System.out.println("GOT HERE");
        Shop shop = new Shop("N852");
        return new ResponseEntity<>(shop, HttpStatus.OK);
    }*/
}