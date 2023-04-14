package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Email
{
    @Id
    @GeneratedValue
    private Long email_id;
    private String email;
    private Long user_id;
}
