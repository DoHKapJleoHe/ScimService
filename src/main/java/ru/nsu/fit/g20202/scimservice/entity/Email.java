package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "email")
public class Email
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name = "user")
    @ManyToOne(optional = false)
    private User user;
}
