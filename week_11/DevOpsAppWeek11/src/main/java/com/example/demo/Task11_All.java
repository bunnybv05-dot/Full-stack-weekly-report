package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/week11")
public class Task11_All {

    // 🔹 TASK 11.1 - Jenkins Setup
    @GetMapping("/task1")
    public String task1() {
        return "Jenkins Installed → Plugins Added → Freestyle Job Created → Build Success (Hello Jenkins)";
    }

    // 🔹 TASK 11.2 - Git Integration
    @GetMapping("/task2")
    public String task2() {
        return "GitHub Connected → Code Pulled → Build Triggered → Webhook Enabled";
    }

    // 🔹 TASK 11.3 - Pipeline
    @GetMapping("/task3")
    public String task3() {
        return "Pipeline Created → Stages: Checkout → Build → Test → Success";
    }

    // 🔹 TASK 11.4 - Testing + Artifacts
    @GetMapping("/task4")
    public String task4() {
        return "Unit Tests Executed → Build Passed/Failed → Artifacts Generated and Stored";
    }

    // 🔹 TASK 11.5 - Deployment
    @GetMapping("/task5")
    public String task5() {
        return "Deployed to Environment → Approval for PROD → Notifications Sent → Monitoring Enabled";
    }
}