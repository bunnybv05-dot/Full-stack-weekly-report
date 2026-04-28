package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task12_4")
public class Task124_Testing {

    @GetMapping("/testing")
    public String testing() {
        return "Run tests → Fail on error → Generate reports → Store artifacts";
    }
}