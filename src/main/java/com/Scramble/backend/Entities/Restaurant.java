package com.Scramble.backend.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue
    private long id;

    public Restaurant(){

    }

    public Restaurant(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
