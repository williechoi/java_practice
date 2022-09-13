package com.example.aop.controller;

import com.example.aop.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name) {
        System.out.println("REST API CONTROLLER: get method");
        System.out.println("get method : " + id);
        System.out.println("get method : " + name);
        System.out.println("REST API CONTROLLER END");
        return id + " " + name;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user) {
        System.out.println("REST API CONTROLLER: post method");
        System.out.println("user: " + user);
        System.out.println("REST API CONTROLLER END");
        return user;
    }

}
