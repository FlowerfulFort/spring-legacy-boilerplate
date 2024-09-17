package com.flowerfulfort.springlegacy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello World GET";
    }
    @PostMapping("/api/hello")
    public String helloPost() {
        return "Hello World POST";
    }
}
