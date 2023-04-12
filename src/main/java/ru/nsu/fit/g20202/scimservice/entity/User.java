package ru.nsu.fit.g20202.scimservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User
{
    //Just template

    @Id
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }
}
