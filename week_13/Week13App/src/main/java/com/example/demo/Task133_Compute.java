package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task13_3")
public class Task133_Compute {

    @GetMapping("/compute")
    public String compute() {
        return "VM Created → Status Running → Instance Stopped to save cost";
    }
}