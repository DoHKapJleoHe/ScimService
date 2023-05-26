package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "meta")
public class Meta
{
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @Column(name = "resource_type")
    private String resourceType;

    @Column(name = "created")
    private String created;

    @Column(name = "last_modified")
    private String lastModified;

    @Column(name = "location")
    private String location;

    @Column(name = "version")
    private String version;
}