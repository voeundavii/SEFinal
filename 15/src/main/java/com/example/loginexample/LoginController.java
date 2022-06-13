package com.example.loginexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    public String getLogin(){
        return "login";
    }

    @GetMapping("/homepage")
    public String getHome(){
        return "home";
    }
}
