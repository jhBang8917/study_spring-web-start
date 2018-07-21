package com.spring.springwebstart.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartRestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
