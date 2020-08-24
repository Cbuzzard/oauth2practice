package com.buzzardsview.oauth2practice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld() {
        return "Hellow World";
    }

    @GetMapping("/restricted")
    public String restricted() {
        return "to see this you must be logged in";
    }

    @RequestMapping(value = "/user")
    public Principal user(Principal principal) {
        return principal;
    }

}
