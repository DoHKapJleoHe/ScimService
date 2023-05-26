package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Photo
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "photo_url")
    private String value;

    @Column(name = "type")
    private String type;

    @JoinColumn(name = "user")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User user;
}
