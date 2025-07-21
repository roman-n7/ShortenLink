package com.roman_n7.ShortenLink.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor // generates a no-arg constructor
@AllArgsConstructor // generates a full-args constructor
public class ShortenRequest {
    private String originalUrl;
    
}
