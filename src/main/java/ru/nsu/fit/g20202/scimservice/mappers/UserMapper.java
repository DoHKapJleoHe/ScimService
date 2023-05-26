package ru.nsu.fit.g20202.scimservice.mappers;

import org.springframework.stereotype.Component;
import ru.nsu.fit.g20202.scimservice.dto.*;
import ru.nsu.fit.g20202.scimservice.entity.*;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserMapper
{
    public static UserDTO toDTO(User user)
    {
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setExternalId(user.getExternalId());
        userDTO.setMeta(MetaMapper.toDTO(user.getMeta()));
        userDTO.setUserName(user.getUserName());
        userDTO.setTimeZone(user.getTimeZone());
        userDTO.setLocale(user.getLocale());
        userDTO.setPreferredLanguage(user.getPreferredLanguage());
        userDTO.setNickname(user.getNickname());
        userDTO.setProfileUrl(user.getProfileUrl());
        userDTO.setUserType(user.getUserType());

        List<String> schemas = new ArrayList<>();
        schemas.add("urn:ietf:params:scim:schemas:core:2.0:User");
        userDTO.setSchemas(schemas);

        if(user.getName() != null)
        {
            userDTO.setName(NameMapper.toDTO(user.getName()));
        }
        userDTO.setDisplayName(user.getDisplayName());

        if(user.getEmails() != null) {
            List<EmailDTO> emailDTO = new ArrayList<>();
            for (Email email : user.getEmails()) {
                emailDTO.add(EmailMapper.toDTO(email));
            }
            userDTO.setEmails(emailDTO);
        }

        if(user.getAddresses() != null) {
            List<AddressDTO> addressDTO = new ArrayList<>();
            for (Address address : user.getAddresses()) {
                addressDTO.add(AddressMapper.toDTO(address));
            }
            userDTO.setAddresses(addressDTO);
        }

        if(user.getPhoneNumbers() != null) {
            List<PhoneNumberDTO> phoneNumberDTO = new ArrayList<>();
            for (PhoneNumber phoneNumber : user.getPhoneNumbers()) {
                phoneNumberDTO.add(PhoneNumberMapper.toDTO(phoneNumber));
            }
            userDTO.setPhoneNumbers(phoneNumberDTO);
        }

        if(user.getIms() != null) {
            List<ImsDTO> imsDTO = new ArrayList<>();
            for (Ims ims : user.getIms()) {
                imsDTO.add(ImsMapper.toDTO(ims));
            }
            userDTO.setIms(imsDTO);
        }

        if(user.getPhotos() != null) {
            List<PhotoDTO> photoDTO = new ArrayList<>();
            for (Photo photo : user.getPhotos()) {
                photoDTO.add(PhotoMapper.toDTO(photo));
            }
            userDTO.setPhotos(photoDTO);
        }

        return userDTO;
    }

    public static User toEntity(UserDTO dto)
    {
        User newUser = User.builder()
                .userName(dto.getUserName())
                .active(dto.isActive())
                .externalId(dto.getExternalId())
                .displayName(dto.getDisplayName())
                .timeZone(dto.getTimeZone())
                .locale(dto.getLocale())
                .preferredLanguage(dto.getPreferredLanguage())
                .profileUrl(dto.getProfileUrl())
                .nickname(dto.getNickname())
                .userType(dto.getUserType())
                .build();

        String time = String.valueOf(java.time.LocalDateTime.now());
        Meta newMeta = Meta.builder()
                .resourceType("User")
                .created(time)
                .lastModified(time)
                .location("Users/"+dto.getUserName())
                .build();

        newMeta.setUser(newUser);
        newUser.setMeta(newMeta);

        if (dto.getName() != null)
        {
            Name newName = NameMapper.toEntity(dto.getName());
            newName.setUser(newUser);
            newUser.setName(newName);
        }

        if(dto.getEmails() != null)
        {
            List<Email> emails = new ArrayList<>();
            for(EmailDTO emailDTO : dto.getEmails())
            {
                Email email = EmailMapper.toEntity(emailDTO);
                email.setUser(newUser);
                emails.add(email);
            }
            newUser.setEmails(emails);
        }

        if(dto.getAddresses() != null)
        {
            List<Address> addresses = new ArrayList<>();
            for(AddressDTO addressDTO : dto.getAddresses())
            {
                Address address = AddressMapper.toEntity(addressDTO);
                address.setUser(newUser);
                addresses.add(address);
            }
            newUser.setAddresses(addresses);
        }

        if(dto.getPhoneNumbers() != null)
        {
            List<PhoneNumber> phoneNumbers = new ArrayList<>();
            for(PhoneNumberDTO phoneNumberDTO : dto.getPhoneNumbers())
            {
                PhoneNumber phoneNumber = PhoneNumberMapper.toEntity(phoneNumberDTO);
                phoneNumber.setUser(newUser);
                phoneNumbers.add(phoneNumber);
            }
            newUser.setPhoneNumbers(phoneNumbers);
        }

        if(dto.getIms() != null)
        {
            List<Ims> imses = new ArrayList<>();
            for(ImsDTO imsDTO : dto.getIms())
            {
                Ims ims = ImsMapper.toEntity(imsDTO);
                ims.setUser(newUser);
                imses.add(ims);
            }
            newUser.setIms(imses);
        }

        if(dto.getPhotos() != null)
        {
            List<Photo> photos = new ArrayList<>();
            for(PhotoDTO photoDTO : dto.getPhotos())
            {
                Photo photo = PhotoMapper.toEntity(photoDTO);
                photo.setUser(newUser);
                photos.add(photo);
            }
            newUser.setPhotos(photos);
        }

        return newUser;
    }
}
