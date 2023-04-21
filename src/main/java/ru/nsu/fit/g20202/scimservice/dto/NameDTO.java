package ru.nsu.fit.g20202.scimservice.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import ru.nsu.fit.g20202.scimservice.entity.Name;
import ru.nsu.fit.g20202.scimservice.entity.User;

public class NameDTO {
    private String formatted;
    private String familyName;
    private String givenName;
    private String middleName;
    private String honorificPrefix;
    private String honorificSuffix;

    public NameDTO(Name name) {
        this.formatted = name.getFormatted();
        this.familyName = name.getFamilyName();
        this.givenName = name.getGivenName();
        this.middleName = name.getMiddleName();
        this.honorificPrefix = name.getHonorificPrefix();
        this.honorificSuffix = name.getHonorificSuffix();
    }
}
