package com.example.jwtauth.testToken;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestToken {
    @PreAuthorize("hasAuthority('USER')")
    @GetMapping("/user")
    public String testUser() {
        return "User Authenticated";
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/admin")
    public String testManager() {
        return "Admin Authenticated";
    }
}
