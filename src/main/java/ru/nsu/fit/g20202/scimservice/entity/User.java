package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name= "user")
public class User
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "external_id")
    private String externalId;

    @Column(name = "meta")
    @OneToOne
    private Meta meta;

    @Column(name = "user_name")
    @NotBlank
    private String userName;

    @Column(name = "name")
    @OneToOne
    private Name name;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "nickname")
    private String nickname;

    @Column(name = "profile_url")
    private String profileUrl;

    @Column(name = "title")
    private String title;

    @Column(name = "user_type")
    private String userType;

    @Column(name = "preferred_language")
    private String preferredLanguage;

    @Column(name = "preferred_language")
    private String locale;

    @Column(name = "preferred_language")
    private String timeZone; // mb create another class to represent timezone?

    @Column(name = "active")
    private Boolean active;

    @OneToMany
    private Set<Photo> photoSet;

    @OneToMany
    private Set<Ims> imsSet;

    @OneToMany
    private Set<PhoneNumber> phoneNumberSet;

    @OneToMany
    private Set<Email> emailSet;

    @OneToMany
    private Set<Entitlement> entitlementSet;

    @ManyToMany
    private Set<Role> roleSet;

    @OneToMany
    private Set<Certificate> certificateSet;
    
    /*@ManyToMany
-    private List<Group> groupList;*/
}
