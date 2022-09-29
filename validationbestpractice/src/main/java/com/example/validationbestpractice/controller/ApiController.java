package com.example.validationbestpractice.controller;

import com.example.validationbestpractice.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/get")
    public User get(@RequestParam Integer age, @RequestParam String name) {
        return new User(name, age);
    }
}
