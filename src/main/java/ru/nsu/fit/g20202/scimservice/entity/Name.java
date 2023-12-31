package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "name")
public class Name
{
    @Id
    @GeneratedValue
    private Integer id;

    @PrimaryKeyJoinColumn(name = "user")
    @NotNull
    @OneToOne
    private User user;

    @Column(name = "formatted")
    private String formatted;

    @Column(name = "family_name")
    private String familyName;

    @Column(name = "given_name")
    private String givenName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "honorific_prefix")
    private String honorificPrefix;

    @Column(name = "honorific_suffix")
    private String honorificSuffix;
    
}
