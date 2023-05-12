package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "address")
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String formatted;
    private String streetAddress;
    private String locality;
    private String region;
    private String postalCode;
    private String country;
    private String type;
    private boolean primary;

    @OneToMany
    private List<User> users;
}
