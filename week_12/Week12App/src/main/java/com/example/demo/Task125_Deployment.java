package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task12_5")
public class Task125_Deployment {

    @GetMapping("/deploy")
    public String deploy() {
        return "Deploy to staging → Configure env → Manual approval → Production deploy";
    }
}