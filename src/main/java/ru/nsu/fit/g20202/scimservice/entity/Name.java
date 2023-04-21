package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name= "meta")
public class Meta
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "user")
    @NotNull
    @OneToOne
    private User user;
}
