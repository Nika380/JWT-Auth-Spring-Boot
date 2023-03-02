package com.example.jwtauth.testToken;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestToken {
    @GetMapping
    public String test() {
        return "Authenticated";
    }
}
