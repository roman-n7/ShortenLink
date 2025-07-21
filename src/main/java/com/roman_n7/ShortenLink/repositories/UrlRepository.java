package com.roman_n7.ShortenLink.repositories;

import com.roman_n7.ShortenLink.models.UrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UrlRepository extends JpaRepository<UrlMapping, Long> {
    public UrlMapping findByShortCode(String shortCode);
}
