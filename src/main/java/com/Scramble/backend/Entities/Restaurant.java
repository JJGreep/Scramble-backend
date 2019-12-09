package com.Scramble.backend.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue
    private long idRestaurant;
    private String linkApi;

    public Restaurant(long idRestaurant, String linkApi) {
        this.idRestaurant = idRestaurant;
        this.linkApi = linkApi;
    }

    public long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getLinkApi() {
        return linkApi;
    }

    public void setLinkApi(String linkApi) {
        this.linkApi = linkApi;
    }
}
