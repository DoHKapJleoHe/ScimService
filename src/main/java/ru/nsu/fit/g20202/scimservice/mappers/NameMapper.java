package ru.nsu.fit.g20202.scimservice.mappers;

import ru.nsu.fit.g20202.scimservice.dto.NameDTO;
import ru.nsu.fit.g20202.scimservice.entity.Name;

public class NameMapper
{
    public static NameDTO toDTO(Name name)
    {
        NameDTO nameDTO = new NameDTO();
        nameDTO.setFormatted(name.getFormatted());
        nameDTO.setFamilyName(name.getFamilyName());
        nameDTO.setGivenName(name.getGivenName());
        nameDTO.setMiddleName(name.getMiddleName());
        nameDTO.setHonorificPrefix(name.getHonorificPrefix());
        nameDTO.setHonorificSuffix(name.getHonorificSuffix());

        return nameDTO;
    }

    /**
     * This mapper creates new Name without User.
     * User should be added separately.
     *
     * @param dto
     * @return Name
     */
    public static Name toEntity(NameDTO dto)
    {
        Name name = Name.builder()
                .familyName(dto.getFamilyName())
                .givenName(dto.getGivenName())
                .middleName(dto.getMiddleName())
                .formatted(dto.getFormatted())
                .honorificPrefix(dto.getHonorificPrefix())
                .honorificSuffix(dto.getHonorificSuffix())
                .build();

        return name;
    }
}
