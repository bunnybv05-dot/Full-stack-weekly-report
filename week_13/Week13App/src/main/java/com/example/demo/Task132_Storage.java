package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task13_2")
public class Task132_Storage {

    @GetMapping("/storage")
    public String storage() {
        return "Storage Created → Files Uploaded → File Accessed";
    }
}