package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "role")
public class Role
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "role")
    private String role;

    @Column(name = "user")
    @ManyToMany
    private Set<User> userSet;
}
