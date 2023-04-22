package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "phone_number")
public class PhoneNumber
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "user")
    @ManyToOne(optional = false)
    private User user;
}
