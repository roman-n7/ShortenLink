package com.roman_n7.ShortenLink.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class RootController {

    @GetMapping("/")
    public String redirectToIndex() {
        return "redirect:/index.html";
    }
}