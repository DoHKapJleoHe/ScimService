package ru.nsu.fit.g20202.scimservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsu.fit.g20202.scimservice.dto.UserDTO;
import ru.nsu.fit.g20202.scimservice.entity.User;
import ru.nsu.fit.g20202.scimservice.mappers.UserMapper;
import ru.nsu.fit.g20202.scimservice.repository.UserRepository;
import ru.nsu.fit.g20202.scimservice.service.UserService;

import java.util.List;
import java.util.Optional;

/**
 * TODO: Parse incoming JSON and create new entity, since the incoming JSON doesn't represent the full entity.
 */
@RestController
@RequestMapping("/User")
public class UserController
{
    @Autowired
    private UserService  userService;

    @GetMapping
    public List<UserDTO> getAllUsers()
    {
        var users =  userService.getAllUsers();

        return users.stream().map(UserMapper::toDTO).toList();
    }

    @PostMapping
    public void addUser(@RequestBody UserDTO newUser) {
        // TODO: separate incoming user from user that will actually be saved to the repo
        userService.createUser(newUser);
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Integer id)
    {
        // TODO: Should notify that no user was found
        Optional<User> user = userService.getUserById(id);

        // TODO: Make check before user.get()
        return UserMapper.toDTO(user.get());
    }


    @PutMapping("/{id}")
    public void replaceUserById(@RequestBody UserDTO newUser, @PathVariable Integer id)
    {
        userService.replaceUserById(newUser, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}
