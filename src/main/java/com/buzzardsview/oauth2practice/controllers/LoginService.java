package com.buzzardsview.oauth2practice.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("login")
public class LoginService {

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = POST)
    public void authenticate() {
    }
}