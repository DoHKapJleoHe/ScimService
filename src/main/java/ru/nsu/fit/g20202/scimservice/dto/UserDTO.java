package ru.nsu.fit.g20202.scimservice.dto;

import lombok.Data;
import ru.nsu.fit.g20202.scimservice.entity.User;

@Data
public class UserDTO
{
    private Integer id;
    private String externalId;
    private Long metaId;
    private String userName;
    private NameDTO name; // TODO: use DTO to JSON conversion
    private String displayName;

    public UserDTO(User user)
    {
        this.id = user.getId();
        this.name = new NameDTO(user.getName());
    }
}
