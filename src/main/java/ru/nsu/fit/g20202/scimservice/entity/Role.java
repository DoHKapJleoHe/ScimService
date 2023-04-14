package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Role
{
    @Id
    @GeneratedValue
    private Long role_id;
    private String role;
    private List<User> user_id = new ArrayList<>();
}
