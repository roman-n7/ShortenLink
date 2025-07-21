package com.roman_n7.ShortenLink.controllers;

import com.roman_n7.ShortenLink.models.UrlMapping;
import com.roman_n7.ShortenLink.repositories.UrlRepository;
import com.roman_n7.ShortenLink.services.UrlService;
import com.roman_n7.ShortenLink.dto.ShortenRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.net.URI;

@Controller
@RestController

public class UrlController {
    @Autowired
    private UrlService urlService;

    @GetMapping("/u/{shortCode}") 
    public ResponseEntity<?> redirect(@PathVariable String shortCode){
        UrlMapping mapping = urlService.findUrlMappingByShortCode(shortCode);
        if(mapping == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Shortcode not found");
        }
        String url = mapping.getOriginalUrl();
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(url)).build();

    }
    
    @PostMapping("/api/shorten")  
    public ResponseEntity<?> shorten(@RequestBody ShortenRequest request){
        UrlMapping mapping = urlService.createNewUrlMapping(request.getOriginalUrl());
        return ResponseEntity.status(HttpStatus.CREATED).location(URI.create("https://shortenlink-ngpy.onrender.com/u/"+mapping.getShortCode())).build();
    }
    
}
