package com.LMS.deployment;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;


    // ✅ GET all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // ✅ CREATE user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}