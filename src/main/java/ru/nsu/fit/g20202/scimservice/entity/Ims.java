package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ims")
public class Ims
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "ims")
    private String ims; // let it be string because i don't know what ims is))

    @Column(name = "user")
    @ManyToOne(optional = false)
    private User user;
}
