package ru.nsu.fit.g20202.scimservice.mappers;

import org.springframework.stereotype.Component;
import ru.nsu.fit.g20202.scimservice.dto.UserDTO;
import ru.nsu.fit.g20202.scimservice.entity.Meta;
import ru.nsu.fit.g20202.scimservice.entity.Name;
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

    public static User toEntity(UserDTO dto)
    {
        User newUser = User.builder()
                .userName(dto.getUserName())
                .active(dto.isActive())
                .externalId(dto.getExternalId())
                .displayName(dto.getDisplayName())
                .build();

        Meta newMeta;

        if (dto.getMeta() != null)
        {
            newMeta = MetaMapper.toEntity(dto.getMeta());
            newMeta.setLastModified(String.valueOf(java.time.LocalDateTime.now()));
        }
        else
        {
            String time = String.valueOf(java.time.LocalDateTime.now());
            newMeta = Meta.builder()
                    .resourceType("User")
                    .created(time)
                    .lastModified(time)
                    .location("Users/"+dto.getUserName())
                    .build();
        }

        newMeta.setUser(newUser);
        newUser.setMeta(newMeta);

        if (dto.getName() != null)
        {
            Name newName = NameMapper.toEntity(dto.getName());
            newName.setUser(newUser);
            newUser.setName(newName);
        }

        return newUser;
    }
}
