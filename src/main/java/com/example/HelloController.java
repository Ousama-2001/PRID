package com.example;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {
    
    @GetMapping("/")
    public String index() {
        return "Hello from Spring Boot!";
    }
}
