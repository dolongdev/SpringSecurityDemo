package com.springsecurity.controller;

import com.springsecurity.entity.User;
import com.springsecurity.model.UserModel;
import com.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User register(@RequestBody UserModel userModel){
        User newUser = new User();
        newUser.setEmail(userModel.getEmail());
        newUser.setPassword(passwordEncoder.encode(userModel.getPassword()));

        String pass = passwordEncoder.encode("123");
        System.out.println(pass);
        return  userRepository.save(newUser);
    }


}
