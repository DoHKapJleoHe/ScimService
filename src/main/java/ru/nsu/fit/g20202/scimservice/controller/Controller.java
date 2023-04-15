package ru.nsu.fit.g20202.scimservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.nsu.fit.g20202.scimservice.entity.User;
import ru.nsu.fit.g20202.scimservice.repository.UserRepository;

import java.util.Optional;

@RestController
public class Controller
{
    private final UserRepository userRepository;

    public Controller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/User/{id}")
    public Optional<User> getUserById(@PathVariable Integer id)
    {
        return userRepository.findById(id);
    }
}
