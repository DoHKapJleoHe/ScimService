package ru.nsu.fit.g20202.scimservice.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsu.fit.g20202.scimservice.dto.UserDTO;
import ru.nsu.fit.g20202.scimservice.entity.User;
import ru.nsu.fit.g20202.scimservice.mappers.UserMapper;
import ru.nsu.fit.g20202.scimservice.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class UserService
{
    private final UserRepository userRepository;

    public void createUser(UserDTO userDTO)
    {
        // TODO: Add name and meta
        User user = User.builder()
                .externalId(userDTO.getExternalId())
                //.meta()
                .build();

        userRepository.save(user);
    }

    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int id)
    {
        return userRepository.findById(id);
    }

    public void deleteUser(int id)
    {
        userRepository.deleteById(id);
    }

    public void replaceUserById(UserDTO newUser, int id)
    {

    }
}
