package ru.nsu.fit.g20202.scimservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO
{
    private Integer id;
    private List<String> schemas;
    private String externalId;
    private MetaDTO meta;
    private boolean active;
    private String userName;
    private NameDTO name;
    private String displayName;
    private String nickname;
    private String profileUrl;
    private String title;
    private String userType;
    private String preferredLanguage;
    private String locale;
    private String timeZone;
    private List<EmailDTO> emails;
    private List<AddressDTO> addresses;
    private List<PhoneNumberDTO> phoneNumbers;
    private List<ImsDTO> ims;
    private List<PhotoDTO> photos;
}
