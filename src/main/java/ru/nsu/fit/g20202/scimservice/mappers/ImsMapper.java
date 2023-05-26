package ru.nsu.fit.g20202.scimservice.mappers;

import ru.nsu.fit.g20202.scimservice.dto.ImsDTO;
import ru.nsu.fit.g20202.scimservice.entity.Ims;

public class ImsMapper
{
    public static ImsDTO toDTO(Ims ims)
    {
        ImsDTO imsDTO = new ImsDTO();
        imsDTO.setValue(ims.getValue());
        imsDTO.setType(ims.getType());
        return imsDTO;
    }

    public static Ims toEntity(ImsDTO dto)
    {
        Ims ims = new Ims();
        ims.setValue(dto.getValue());
        ims.setType(dto.getType());
        return ims;
    }
}
