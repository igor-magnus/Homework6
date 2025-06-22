package com.example.controller;

import com.example.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {

    private final List<User> users = Arrays.asList(
            new User("Иван", "ivan@email.com", 23),
            new User("Мария", "maria@email.com", 29)
    );

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }
}