package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Ims
{
    @Id
    @GeneratedValue
    private Long ims_id;
    private String ims; // let it be string because i don't know what ims is))
    private Long user_id;
}
