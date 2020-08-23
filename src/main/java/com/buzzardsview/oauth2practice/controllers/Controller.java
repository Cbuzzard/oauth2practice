package com.buzzardsview.oauth2practice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
