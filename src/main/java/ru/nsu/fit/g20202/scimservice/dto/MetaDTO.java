package ru.nsu.fit.g20202.scimservice.dto;

import lombok.Data;
import ru.nsu.fit.g20202.scimservice.entity.Meta;

import java.util.Date;

@Data
public class MetaDTO
{
    private Integer id;
    private String resourceType;
    private String location;
    private String version;
}
