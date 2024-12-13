package com.example.spring_boot_docker.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "{\"message\": \"Hello, DevOps!\"}";
    }

    @PostMapping("/echo")
    public String echo(@RequestBody String input) {
        return input;
    }
}

