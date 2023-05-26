package ru.nsu.fit.g20202.scimservice.mappers;


import ru.nsu.fit.g20202.scimservice.dto.AddressDTO;
import ru.nsu.fit.g20202.scimservice.entity.Address;

public class AddressMapper
{
    public static AddressDTO toDTO(Address address)
    {
        AddressDTO dto = new AddressDTO();
        dto.setFormatted(address.getFormatted());
        dto.setStreetAddress(address.getStreetAddress());
        dto.setLocality(address.getLocality());
        dto.setRegion(address.getRegion());
        dto.setPostalCode(address.getPostalCode());
        dto.setCountry(address.getCountry());
        dto.setType(address.getType());
        dto.setPrimary(address.isPrimary());
        return dto;
    }

    public static Address toEntity(AddressDTO dto)
    {
        Address address = new Address();
        address.setFormatted(dto.getFormatted());
        address.setStreetAddress(dto.getStreetAddress());
        address.setLocality(dto.getLocality());
        address.setRegion(dto.getRegion());
        address.setPostalCode(dto.getPostalCode());
        address.setCountry(dto.getCountry());
        address.setType(dto.getType());
        address.setPrimary(dto.isPrimary());
        return address;
    }
}
