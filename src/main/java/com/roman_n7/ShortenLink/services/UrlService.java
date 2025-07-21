package com.roman_n7.ShortenLink.services;

import com.roman_n7.ShortenLink.models.UrlMapping;
import com.roman_n7.ShortenLink.repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UrlService {

    @Autowired
    private  UrlRepository urlRepository;

    public UrlMapping createNewUrlMapping(String originalUrl){
        UrlMapping mapping = new UrlMapping();
        mapping.setOriginalUrl(originalUrl);
        mapping.setShortCode(generateShortCode());

        return urlRepository.save(mapping);
    }

    public UrlMapping findUrlMappingByShortCode(String shortCode){
        return urlRepository.findByShortCode(shortCode);
    } 

    public void deleteUrlMapping(UrlMapping urlMapping){
        urlRepository.delete(urlMapping);
    }
    
    private String generateShortCode() {
        // e.g., generate a random 6-char string or hash
        return UUID.randomUUID().toString().substring(0, 6);
    }



}
