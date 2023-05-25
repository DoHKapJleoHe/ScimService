package ru.nsu.fit.g20202.scimservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nsu.fit.g20202.scimservice.entity.Group;
import ru.nsu.fit.g20202.scimservice.entity.User;
import ru.nsu.fit.g20202.scimservice.exceptions.ImmutableAttributeException;
import ru.nsu.fit.g20202.scimservice.exceptions.ResourceNotFoundException;
import ru.nsu.fit.g20202.scimservice.exceptions.UniqueAttributeException;

import java.util.List;

@Service
@AllArgsConstructor
public class GroupService
{/*
    private final GroupRepository groupRepository;

    public Group createGroup(Group group)
    {
        if(groupRepository.existsByDisplayName(group.getDisplayName())){
            throw new UniqueAttributeException("displayName");
        }
        groupRepository.save(group);
        return group;
    }

    public List<User> getAllGroups()
    {
        return groupRepository.findAll();
    }

    public Group getGroupById(int id)
    {
        if(!groupRepository.existsById(id))
        {
            throw new ResourceNotFoundException(id);
        }
        return groupRepository.findById(id).get();
    }

    public void deleteGroup(int id)
    {
        if(!groupRepository.existsById(id))
        {
            throw new ResourceNotFoundException(id);
        }
        groupRepository.deleteById(id);
    }

    public Group replaceGroupById(Group newGroup, int id)
    {
        if(!groupRepository.existsById(id))
        {
            throw new ResourceNotFoundException(id);
        }
        if(id != newGroup.getId())
        {
            throw new ImmutableAttributeException("id");
        }
        groupRepository.save(newGroup);
        return newGroup;
    }
*/
}
