package ru.nsu.fit.g20202.scimservice.dto;

import lombok.Data;
import ru.nsu.fit.g20202.scimservice.entity.User;

@Data
public class UserDTO
{
    private Integer id;
    private String externalId;
    private MetaDTO meta;
    private boolean active;
    private String userName;
    private NameDTO name;
    private String displayName;
}
