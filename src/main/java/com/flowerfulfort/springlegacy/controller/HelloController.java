package com.flowerfulfort.springlegacy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String index(Model model) {
        model.addAttribute("message", "Hello World from spring legacy");
        return "index";
    }
}
