package ru.nsu.fit.g20202.scimservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class RoleDTO
{
    private String role;
    private List<UserDTO> users;
}
