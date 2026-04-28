package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Spring Boot is working!";
    }

    @RequestMapping("/test")
    public String test() {
        return "Test working!";
    }
}