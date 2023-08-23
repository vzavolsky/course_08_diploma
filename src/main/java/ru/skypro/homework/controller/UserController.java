package ru.skypro.homework.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/users")
@RequiredArgsConstructor
@RestController
@CrossOrigin(value = "http://localhost:3000")
public class UserController {

    @GetMapping("/me")
    public ResponseEntity<?> getUser() {
        return ResponseEntity.ok().build();
    }

}
