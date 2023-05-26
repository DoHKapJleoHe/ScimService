package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "certificate")
public class Certificate
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "certificate_name")
    private String value;

    @JoinColumn(name = "user")
    @NotNull
    @ManyToOne(optional = false)
    private User user;
}
