package ru.nsu.fit.g20202.scimservice.mappers;

import ru.nsu.fit.g20202.scimservice.dto.MetaDTO;
import ru.nsu.fit.g20202.scimservice.entity.Meta;

public class MetaMapper
{
    public static MetaDTO toDTO(Meta meta)
    {
        MetaDTO metaDTO = new MetaDTO();

        metaDTO.setId(meta.getId());
        metaDTO.setResourceType(meta.getResourceType());
        metaDTO.setLocation(meta.getLocation());
        metaDTO.setVersion(meta.getVersion());

        return metaDTO;
    }

    // TODO: finish this
    public static Meta toEntity(MetaDTO metaDTO)
    {
        Meta meta = Meta.builder()
                .id(metaDTO.getId())
                .build();

        return meta;
    }
}
