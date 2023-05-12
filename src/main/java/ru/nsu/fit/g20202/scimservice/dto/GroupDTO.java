package ru.nsu.fit.g20202.scimservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class GroupDTO
{
    private String externalId;
    private MetaDTO metaDTO;
    private String displayName;
    private List<UserDTO> members;
}
