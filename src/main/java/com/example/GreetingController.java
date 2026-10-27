package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/api/greeting")
    public GreetingResponse greet(@RequestParam(required = false) String name) {
        return new GreetingResponse(greetingService.createGreeting(name));
    }

    public record GreetingResponse(String message) {
    }
}
