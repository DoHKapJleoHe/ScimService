package ru.nsu.fit.g20202.scimservice.mappers;

import ru.nsu.fit.g20202.scimservice.dto.MetaDTO;
import ru.nsu.fit.g20202.scimservice.entity.Meta;

import java.text.ParseException;

public class MetaMapper
{
    public static MetaDTO toDTO(Meta meta)
    {
        MetaDTO metaDTO = new MetaDTO();

        metaDTO.setId(meta.getId());
        metaDTO.setCreated(meta.getCreated());
        metaDTO.setLastModified(meta.getLastModified());
        metaDTO.setResourceType(meta.getResourceType());
        metaDTO.setLocation(meta.getLocation());
        metaDTO.setVersion(meta.getVersion());

        return metaDTO;
    }

    /**
     * This mapper creates new Meta without User.
     * User should be added separately.
     *
     * @param dto
     * @return Meta
     */
    public static Meta toEntity(MetaDTO dto)
    {
        var meta = Meta.builder()
                .version(dto.getVersion())
                .resourceType(dto.getResourceType())
                .location(dto.getLocation())
                .build();

        return meta;
    }
}
