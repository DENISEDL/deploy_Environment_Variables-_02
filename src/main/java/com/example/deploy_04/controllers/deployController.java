package com.example.deploy_04.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class deployController {
    @Value("${welcomeMsg}")
    private String welcomeMsg;

    @GetMapping("/")
    public String welcome() {
        return welcomeMsg;
    }
}
