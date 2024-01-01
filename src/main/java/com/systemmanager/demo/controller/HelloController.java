package com.systemmanager.demo.controller;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
}
