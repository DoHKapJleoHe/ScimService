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
}
