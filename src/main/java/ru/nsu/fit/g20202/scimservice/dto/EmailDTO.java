package ru.nsu.fit.g20202.scimservice.dto;

import lombok.Data;

@Data
public class EmailDTO
{
    private String value;
    private String type;
    private boolean primary;
}
