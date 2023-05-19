package ru.nsu.fit.g20202.scimservice.mappers;

import org.springframework.stereotype.Component;
import ru.nsu.fit.g20202.scimservice.dto.UserDTO;
import ru.nsu.fit.g20202.scimservice.entity.User;

@Component
public class UserMapper
{
    public static UserDTO toDTO(User user)
    {
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setExternalId(userDTO.getExternalId());
        userDTO.setMeta(MetaMapper.toDTO(user.getMeta()));
        userDTO.setUserName(userDTO.getUserName());
        userDTO.setName(NameMapper.toDTO(user.getName()));
        userDTO.setDisplayName(userDTO.getDisplayName());

        return userDTO;
    }
}
