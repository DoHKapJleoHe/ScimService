package ru.nsu.fit.g20202.scimservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/User/{id}")
    public void getUserById(@PathVariable String id)
    {

    }
}
