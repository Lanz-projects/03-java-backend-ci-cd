package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingServiceTest {
    private final GreetingService service = new GreetingService();

    @Test
    void greetsByName() {
        assertEquals("Hello, Ada!", service.createGreeting("Ada"));
    }

    @Test
    void trimsSpacesAroundName() {
        assertEquals("Hello, Ada!", service.createGreeting("  Ada  "));
    }

    @Test
    void usesDefaultForMissingName(){
        assertEquals("Hello, world!", service.createGreeting(null));
    }

    @Test
    void usesDefaultForBlankName() {
        assertEquals("Hello, world!", service.createGreeting("  "));
    }

}
