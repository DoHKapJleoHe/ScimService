package ru.nsu.fit.g20202.scimservice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import ru.nsu.fit.g20202.scimservice.entity.Name;
import ru.nsu.fit.g20202.scimservice.entity.User;

@Data
public class NameDTO
{
    private String formatted;
    private String familyName;
    private String givenName;
    private String middleName;
    private String honorificPrefix;
    private String honorificSuffix;
}
