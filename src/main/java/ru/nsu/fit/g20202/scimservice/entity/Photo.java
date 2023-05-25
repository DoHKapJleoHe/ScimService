package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Photo
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "photo_url")
    private String photoUrl;

    @JoinColumn(name = "user")
    @ManyToOne(optional = false)
    private User user;
}
