package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task13_1")
public class Task131_APIGateway {

    @GetMapping("/api")
    public String api() {
        return "Lambda API Response: Hello from API Gateway";
    }
}