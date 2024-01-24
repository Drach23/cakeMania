package com.unitech.cakemania.Auth;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping(value = "login")
    public String login(){
        return "Login from public endpoint";
    }
    @PostMapping(value = "register")
    public String register(){
        return "Register from public endpoint";
    }
}