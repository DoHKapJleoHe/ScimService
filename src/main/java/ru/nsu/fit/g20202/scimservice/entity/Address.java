package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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
    private boolean isPrimary;

    @JoinColumn(name = "user")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User user;
}
