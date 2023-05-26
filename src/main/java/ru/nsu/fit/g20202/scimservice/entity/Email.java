package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "email")
public class Email
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "email")
    private String value;

    @Column(name = "type")
    private String type;

    @Column(name = "is_primary")
    private boolean isPrimary;

    @JoinColumn(name = "user")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private User user;
}
