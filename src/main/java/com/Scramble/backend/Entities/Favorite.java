package com.Scramble.backend.Entities;

import javax.persistence.*;

@Entity
public class Favorite {
    @Id
    @GeneratedValue
    private long idFavorite;

    private long restaurantIdRestaurant;

    public Favorite(long idFavorite, long restaurantIdRestaurant) {
        this.idFavorite = idFavorite;
        this.restaurantIdRestaurant = restaurantIdRestaurant;
    }

    public long getIdFavorite() {
        return idFavorite;
    }

    public void setIdFavorite(long idFavorite) {
        this.idFavorite = idFavorite;
    }

    public long getRestaurantIdRestaurant() {
        return restaurantIdRestaurant;
    }

    public void setRestaurantIdRestaurant(long restaurantIdRestaurant) {
        this.restaurantIdRestaurant = restaurantIdRestaurant;
    }
}
