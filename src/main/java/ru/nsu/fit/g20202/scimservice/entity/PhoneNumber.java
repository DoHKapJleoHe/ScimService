package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PhoneNumber
{
    @Id
    @GeneratedValue
    private Long phone_id;
    private Long phone_number;
    private Long user_id;
}
