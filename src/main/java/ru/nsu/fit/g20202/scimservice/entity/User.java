package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User
{
    @Id
    @GeneratedValue
    private Long id;
    private Long external_id;
    private Long meta_id;
    private String user_name;
    private String name; // in photo type was JSON, so i don't know what to do
    private String display_name;
    private String nickname;
    private String profile_url;
    private String title;
    private String user_type;
    private String preferred_language;
    private String locale;
    private String time_zone; // mb create another class to represent timezone?
    private boolean active;
}
