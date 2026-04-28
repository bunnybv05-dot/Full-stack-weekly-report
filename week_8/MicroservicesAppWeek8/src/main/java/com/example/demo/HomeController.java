package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // Step 1 (home)
    @RequestMapping("/")
    public String home() {
        return "Spring Boot is working!";
    }

    // ✅ Step 2 (ADD HERE inside same class)
    @RequestMapping("/test")
    public String test() {
        return "Test working!";
    }
}