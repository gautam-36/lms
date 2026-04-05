package com.LMS.deployment;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private finasl UserRepository userRepository;


    // ✅ GET all users
    @GetMapping
    public List<User> getAllUsers() {
        log.info("printing all users");
        return userRepository.findAll();
    }

    // ✅ CREATE user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}