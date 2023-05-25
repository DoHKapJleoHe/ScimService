package ru.nsu.fit.g20202.scimservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class AddressDTO
{
    private String formatted;
    private String streetAddress;
    private String locality;
    private String region;
    private String postalCode;
    private String country;
    private String type;
    private boolean isPrimary;
    private List<UserDTO> users;
}
