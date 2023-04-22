package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "entitlement")
public class Entitlement
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "entitlement")
    private String entitlement;

    @Column(name = "user")
    @ManyToOne(optional = false)
    private User user;
}
