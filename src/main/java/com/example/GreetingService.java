package com.example;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String createGreeting(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, world!";
        }

        return "Hello, " + name.trim() + "!";
    }
}
