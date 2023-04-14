package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Photo
{
    @Id
    @GeneratedValue
    private Long photo_id;
    private String photo_url;
    private Long user_id;
}
