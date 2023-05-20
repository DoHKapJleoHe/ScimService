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

        Meta newMeta = Meta.builder()
                .version(dto.getMeta().getVersion())
                .resourceType(dto.getMeta().getResourceType())
                .location(dto.getMeta().getLocation())
                .user(newUser)
                .build();

        newUser.setMeta(newMeta);

        Name newName = Name.builder()
                .familyName(dto.getName().getFamilyName())
                .givenName(dto.getName().getGivenName())
                .middleName(dto.getName().getMiddleName())
                .formatted(dto.getName().getFormatted())
                .honorificPrefix(dto.getName().getHonorificPrefix())
                .honorificSuffix(dto.getName().getHonorificSuffix())
                .user(newUser)
                .build();

        newUser.setName(newName);

        return newUser;
    }
}
