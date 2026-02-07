package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SecureApp {

    @GetMapping("/")
    public String hello() {
        return "Secure CI/CD App Running 🚀";
    }

    public static void main(String[] args) {
        SpringApplication.run(SecureApp.class, args);
    }
}
