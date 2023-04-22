package ru.nsu.fit.g20202.scimservice.dto;

import ru.nsu.fit.g20202.scimservice.entity.Meta;

import java.util.Date;

public class MetaDTO {
    private Integer id;
    private String resourceType;
    private Date created;
    private Date lastModified;
    private String location;
    private String version;

    public MetaDTO(Meta meta) {
        this.id = meta.getId();
        this.resourceType = meta.getResourceType();
        this.created = meta.getCreated();
        this.lastModified = meta.getLastModified();
        this.location = meta.getLocation();
        this.version = meta.getVersion();
    }
}
