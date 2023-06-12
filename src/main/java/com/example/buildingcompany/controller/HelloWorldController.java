package com.example.buildingcompany.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/api/hello")
    public String sayHello(
            @RequestParam(name = "subject", defaultValue = "World") String subject
    ) {
        return "Hello " + subject;
    }

}
