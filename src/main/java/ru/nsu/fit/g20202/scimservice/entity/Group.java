package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name= "`group`")
public class Group {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "external_id")
    private String externalId;

    @PrimaryKeyJoinColumn(name = "meta")
    @OneToOne
    private Meta meta;

    @Column(name = "display_name")
    @NotBlank
    private String displayName;

    @ManyToMany
    private Set<User> members;
}
