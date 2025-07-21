# ShortenLink URL Shortener

A simple URL shortening service built with Spring Boot.  
It provides REST APIs to shorten URLs and redirect short codes to the original URLs.  
Includes a basic frontend interface to shorten URLs via a web page.

👉 **Live Demo:** [https://shortenlink-ngpy.onrender.com](https://shortenlink-ngpy.onrender.com)

---

## Features

- ✅ Shorten long URLs to short codes  
- 🔁 Redirect short codes to original URLs  
- 🌐 Simple frontend with HTML, CSS, and JavaScript  
- 💾 Uses Spring Data JPA for database operations  
- 🐳 Dockerized for easy deployment
---

## Project Structure

- **UrlController**: Handles URL shortening and redirection REST endpoints  
- **RootController**: Redirects root requests to the frontend index.html  
- **UrlRepository**: Spring Data JPA repository for URL mappings  
- **Frontend**: Simple HTML page for input and displaying shortened URLs  

---

## API Endpoints

| Method | Endpoint          | Description                         |
|--------|-------------------|-----------------------------------|
| GET    | /u/{shortCode}    | Redirects to the original URL     |
| POST   | /api/shorten      | Creates a new shortened URL        |
