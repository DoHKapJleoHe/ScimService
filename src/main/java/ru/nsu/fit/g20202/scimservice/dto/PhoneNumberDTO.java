package ru.nsu.fit.g20202.scimservice.dto;

import lombok.Data;

@Data
public class PhoneNumberDTO
{
    private String phoneNumber;
    private UserDTO user;
}
