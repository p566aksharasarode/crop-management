package edu.iu.p566.crop_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/")
    public String greetings() {
        return "Hello from crop management system\n" + System.currentTimeMillis();

    }
}