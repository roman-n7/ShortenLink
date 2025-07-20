package com.roman_n7.ShortenLink.models;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data // generates getters, setters, toString, equals, hashCode
@NoArgsConstructor // generates a no-arg constructor
@AllArgsConstructor // generates a full-args constructor
public class UrlMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String originalUrl;
    private String shortCode;
}
