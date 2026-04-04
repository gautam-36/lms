package com.LMS.deployment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(UserRepository userRepository) {
        return args -> {

            if (userRepository.count() == 0) {
                userRepository.save(new User("Gautam", "gautam@example.com"));
                userRepository.save(new User("Rahul", "rahul@example.com"));
                userRepository.save(new User("Amit", "amit@example.com"));
                userRepository.save(new User("Neha", "neha@example.com"));
            }

        };
    }
}