package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task12_3")
public class Task123_Pipeline {

    @GetMapping("/pipeline")
    public String pipeline() {
        return "Pipeline Stages: Build → Test → Execute jobs using runner";
    }
}