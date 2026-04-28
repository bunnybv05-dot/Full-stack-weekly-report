package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task12_2")
public class Task122_GitIntegration {

    @GetMapping("/process")
    public String process() {
        return "Create .gitlab-ci.yml → Define stages → Commit → Push → Pipeline runs";
    }
}