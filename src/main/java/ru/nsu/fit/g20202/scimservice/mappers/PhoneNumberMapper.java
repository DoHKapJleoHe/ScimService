package ru.nsu.fit.g20202.scimservice.mappers;

import ru.nsu.fit.g20202.scimservice.dto.PhoneNumberDTO;
import ru.nsu.fit.g20202.scimservice.entity.PhoneNumber;

public class PhoneNumberMapper
{
    public static PhoneNumberDTO toDTO(PhoneNumber phoneNumber)
    {
        PhoneNumberDTO dto = new PhoneNumberDTO();
        dto.setValue(phoneNumber.getValue());
        dto.setType(phoneNumber.getType());
        return dto;
    }

    public static PhoneNumber toEntity(PhoneNumberDTO dto)
    {
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setValue(dto.getValue());
        phoneNumber.setType(dto.getType());
        return phoneNumber;
    }
}
