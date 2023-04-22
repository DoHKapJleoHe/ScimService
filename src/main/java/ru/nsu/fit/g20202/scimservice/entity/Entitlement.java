package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Entitlement
{
    @Id
    @GeneratedValue
    private Long entitlement_id;
    private String entitlement;
    private Long user;
}
