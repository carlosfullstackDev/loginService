package com.example.login;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {


    @GetMapping("/example")
    public ResponseEntity<String> example() {
        return ResponseEntity.ok("This is an example endpoint");
    }

    @GetMapping("/secured/example")
    public ResponseEntity<String> securedExample() {
        return ResponseEntity.ok("This is a secured example endpoint");
    }
    @GetMapping("/logout")
    public ResponseEntity<String> logooutExample() {
        return ResponseEntity.ok("This is a logout endpoint");
    }
}
