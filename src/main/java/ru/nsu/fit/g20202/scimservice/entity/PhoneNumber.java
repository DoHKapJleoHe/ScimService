package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "phone_number")
public class PhoneNumber
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "phone_number")
    private String value;

    @Column(name = "type")
    private String type;

    @JoinColumn(name = "user")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User user;
}
