package ru.nsu.fit.g20202.scimservice.dto;

import lombok.Data;

import java.util.List;

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
    private List<EmailDTO> emails;
    private List<AddressDTO> addresses;
    private List<PhoneNumberDTO> phoneNumbers;
    private List<ImsDTO> ims;
    private List<PhotoDTO> photos;
}
