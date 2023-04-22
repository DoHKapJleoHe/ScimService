package ru.nsu.fit.g20202.scimservice.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.g20202.scimservice.dto.UserDTO;
import ru.nsu.fit.g20202.scimservice.entity.User;
import ru.nsu.fit.g20202.scimservice.repository.UserRepository;

import java.util.Set;

@Service
@AllArgsConstructor
public class UserService
{
    private final UserRepository userRepository;

    public User createUser(UserDTO userDTO)
    {
        // TODO: Add name and meta
        User user = User.builder()
                .id(userDTO.getId())
                .externalId(userDTO.getExternalId())
                .userName(userDTO.getUserName())
                .displayName(userDTO.getDisplayName())
                .build();

        return userRepository.save(user);
    }

    public Set<User> getAllUsers()
    {
        return (Set<User>) userRepository.findAll();
    }
}
