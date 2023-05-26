package ru.nsu.fit.g20202.scimservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nsu.fit.g20202.scimservice.entity.Meta;
import ru.nsu.fit.g20202.scimservice.entity.User;
import ru.nsu.fit.g20202.scimservice.exceptions.ImmutableAttributeException;
import ru.nsu.fit.g20202.scimservice.exceptions.ResourceNotFoundException;
import ru.nsu.fit.g20202.scimservice.exceptions.UniqueAttributeException;
import ru.nsu.fit.g20202.scimservice.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService
{
    private final UserRepository userRepository;

    public User createUser(User user)//Должен вернуть 201 и json с User (или 409 если кинули исключение)
    {
        if(userRepository.existsByUserName(user.getUserName())){//Нужно добавить этот метод в репозиторий
            throw new UniqueAttributeException("userName");
        }
        userRepository.save(user);
        return user;
    }

    public List<User> getAllUsers()//Должен вернуть 200 и json-ы с User
    {
        return userRepository.findAll();
    }

    public User getUserById(int id)//Должен вернуть 200 и json с User (или 404 если кинули исключение)
    {
        if(!userRepository.existsById(id))
        {
            throw new ResourceNotFoundException(id);
        }
        return userRepository.findById(id).get();
    }

    public void deleteUser(int id)//Должен вернуть 204 или 404 если кинули исключение
    {
        if(!userRepository.existsById(id))
        {
            throw new ResourceNotFoundException(id);
        }
        userRepository.deleteById(id);
    }

    public User replaceUserById(User newUser, int id)//Должен вернуть 200 и json с User (или 404 если UserNotFound и 400 если ImmutableAttribute)
    {
        if(!userRepository.existsById(id))
        {
            throw new ResourceNotFoundException(id);
        }
        if(newUser.getId() == null)
        {
            newUser.setId(id);
        }
        if(id != newUser.getId())
        {
            throw new ImmutableAttributeException("id");
        }

        User oldUser = userRepository.findById(id).get();
        Meta meta = oldUser.getMeta();
        meta.setLastModified(String.valueOf(java.time.LocalDateTime.now()));
        newUser.setMeta(meta);

        userRepository.save(newUser);
        return newUser;
    }
}
