package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

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

    @Column(name = "resource_type")
    private String resourceType;

    @Column(name = "created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    @Column(name = "last_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModified;

    @Column(name = "location")
    private String location;

    @Column(name = "version")
    private String version;
    
}