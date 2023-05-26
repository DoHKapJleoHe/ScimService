package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "user")
public class User
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "external_id")
    private String externalId;

    @OneToOne(cascade = CascadeType.ALL)
    private Meta meta;

    @PrimaryKeyJoinColumn(name = "user_name")
    @NotBlank
    private String userName;

    @PrimaryKeyJoinColumn(name = "name")
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

    @Column(name = "locale")
    private String locale;

    @Column(name = "time_zone")
    private String timeZone; // mb create another class to represent timezone?

    @Column(name = "active")
    private Boolean active;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Photo> photos;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Ims> ims;

    @OneToMany(cascade = CascadeType.ALL)
    private List<PhoneNumber> phoneNumbers;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Email> emails;

    @OneToMany
    private List<Entitlement> entitlements;

    @ManyToMany
    private List<Role> roles;

    @OneToMany
    private List<Certificate> certificates;
    
    @ManyToMany
    private List<Group> groups;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Address> addresses;
}
