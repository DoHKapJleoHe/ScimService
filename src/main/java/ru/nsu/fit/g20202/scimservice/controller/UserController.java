package ru.nsu.fit.g20202.scimservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nsu.fit.g20202.scimservice.dto.UserDTO;
import ru.nsu.fit.g20202.scimservice.entity.User;
import ru.nsu.fit.g20202.scimservice.mappers.UserMapper;
import ru.nsu.fit.g20202.scimservice.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers()
    {
        List<User> users =  userService.getAllUsers();

        return new ResponseEntity<>(users.stream().map(UserMapper::toDTO).toList(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO newUserDTO)
    {
        User newUser = UserMapper.toEntity(newUserDTO);

        User responseUser = userService.createUser(newUser);

        UserDTO responseUserDTO = UserMapper.toDTO(responseUser);

        return new ResponseEntity<>(responseUserDTO, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Integer id)
    {
        User user = userService.getUserById(id);

        return new ResponseEntity<>(UserMapper.toDTO(user), HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> replaceUserById(@RequestBody UserDTO newUserDTO, @PathVariable Integer id)
    {
        User newUser = UserMapper.toEntity(newUserDTO);

        User responseUser = userService.replaceUserById(newUser, id);

        UserDTO responseUserDTO = UserMapper.toDTO(responseUser);

        return new ResponseEntity<>(responseUserDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);

        return ResponseEntity.noContent().build();
    }
}
