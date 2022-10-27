package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/home")
    public String home(){
        return "Admin home!";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "Admin dashboard!";
    }
}
