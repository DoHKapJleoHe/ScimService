package ru.nsu.fit.g20202.scimservice.dto;

import lombok.Data;
import ru.nsu.fit.g20202.scimservice.entity.User;

@Data
public class UserDTO
{
    private Integer id;
    private String external_id;
    private Long meta_id;
    private String user_name;
    private NameDTO name; // TODO: use DTO to JSON conversion
    private String display_name;

    public UserDTO(User user)
    {
        this.id = user.getId();
        this.name = new NameDTO(user.getName());
    }
}
