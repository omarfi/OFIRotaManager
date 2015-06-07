package com.ofi.rotamanager;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/**")
@RestController
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "hello";
    }
}