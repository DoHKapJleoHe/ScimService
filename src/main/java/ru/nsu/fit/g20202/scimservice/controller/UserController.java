package ru.nsu.fit.g20202.scimservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.fit.g20202.scimservice.entity.User;
import ru.nsu.fit.g20202.scimservice.repository.UserRepository;

import java.util.List;

/**
 * TODO: Parse incoming JSON and create new entity, since the incoming JSON doesn't represent the full entity.
 * TODO: Return DTOs, not the entities themselves.
 */
@RestController
@RequestMapping("/User")
public class UserController
{
    @Autowired
    private UserRepository userRepository;

    public UserController(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody User newUser) {
        userRepository.save(newUser);

        // TODO: separate incoming user from user that will actually be saved to the repo

        return newUser;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        // TODO: Should notify that no user was found
        return userRepository.findById(id).orElse(new User());
    }


    @PutMapping("/{id}")
    public User replaceUserById(@RequestBody User newUser, @PathVariable Integer id) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(newUser.getName());
                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return userRepository.save(newUser);
                });
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }
}
