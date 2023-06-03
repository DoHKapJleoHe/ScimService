package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ims")
public class Ims
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "ims")
    private String value; // let it be string because i don't know what ims is))

    @Column(name = "type")
    private String type;

    @JoinColumn(name = "user")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
