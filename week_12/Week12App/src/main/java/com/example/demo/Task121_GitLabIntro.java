package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task12_1")
public class Task121_GitLabIntro {

    @GetMapping("/steps")
    public String steps() {
        return "Create GitLab account → Create project → Push code → CI/CD concepts";
    }
}