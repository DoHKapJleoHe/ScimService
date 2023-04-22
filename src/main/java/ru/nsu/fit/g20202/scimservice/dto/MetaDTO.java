package ru.nsu.fit.g20202.scimservice.dto;

import ru.nsu.fit.g20202.scimservice.entity.Meta;

import java.util.Date;

public class MetaDTO {
    private String resourceType;
    private String location;
    private String version;

    public MetaDTO(Meta meta) {
        this.resourceType = meta.getResourceType();
        this.location = meta.getLocation();
        this.version = meta.getVersion();
    }
}
