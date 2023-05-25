package ru.nsu.fit.g20202.scimservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nsu.fit.g20202.scimservice.dto.GroupDTO;
import ru.nsu.fit.g20202.scimservice.entity.Group;
//import ru.nsu.fit.g20202.scimservice.mappers.GroupMapper;
import ru.nsu.fit.g20202.scimservice.service.GroupService;

import java.util.List;

@RestController
@RequestMapping("/Groups")
public class GroupController {
    /*
    @Autowired
    private GroupService groupService;

    // Get all
    @GetMapping
    public ResponseEntity<List<GroupDTO>> getAllGroups() {
        List<Group> groups =  groupService.getAllGroups();

        return new ResponseEntity<>(groups.stream().map(GroupMapper::toDTO).toList(), HttpStatus.OK);
    }

    // Get by id
    @GetMapping("/{id}")
    public ResponseEntity<GroupDTO> getGroupById(@PathVariable Integer id) {
        Group group = groupService.getGroupById(id);

        return new ResponseEntity<>(GroupMapper.toDTO(group), HttpStatus.OK);
    }

    // Add new group
    @PostMapping
    public ResponseEntity<GroupDTO> addGroup(@RequestBody GroupDTO newGroupDTO) {
        Group newGroup = GroupMapper.toEntity(newGroupDTO);

        Group responseGroup = groupService.createGroup(newGroup);

        GroupDTO responseGroupDTO = GroupMapper.toDTO(responseGroup);

        return new ResponseEntity<>(responseGroupDTO, HttpStatus.CREATED);
    }

    // Replace by id
    @PutMapping("/{id}")
    public ResponseEntity<GroupDTO> replaceGroupById(@RequestBody GroupDTO newGroupDTO, @PathVariable Integer id) {
        Group newGroup = GroupMapper.toEntity(newGroupDTO);

        Group responseGroup = groupService.replaceGroupById(newGroup, id);

        GroupDTO responseGroupDTO = GroupMapper.toDTO(responseGroup);

        return new ResponseEntity<>(responseGroupDTO, HttpStatus.OK);
    }

    // Delete by id
    @DeleteMapping("/{id}")
    public ResponseEntity<GroupDTO> deleteGroup(@PathVariable Integer id) {
        groupService.deleteGroup(id);

        return ResponseEntity.noContent().build();

    }*/
}
