package ru.nsu.fit.g20202.scimservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nsu.fit.g20202.scimservice.dto.GroupDTO;

import java.util.List;

@RestController
@RequestMapping("/Groups")
public class GroupController {
    // Get all
    @GetMapping
    public ResponseEntity<List<GroupDTO>> getAllGroups() {}

    // Get by id
    @GetMapping("/{id}")
    public ResponseEntity<GroupDTO> getGroupById(@PathVariable Integer id) {}

    // Add new group
    @PostMapping
    public ResponseEntity<GroupDTO> addGroup(@RequestBody GroupDTO groupDTO) {}

    // Replace by id
    @PutMapping("/{id}")
    public ResponseEntity<GroupDTO> replaceGroupById(@RequestBody GroupDTO newUserDTO, @PathVariable Integer id) {}

    // Delete by id
    @DeleteMapping("/{id}")
    public ResponseEntity<GroupDTO> deleteGroup(@PathVariable Integer id) {}
}
