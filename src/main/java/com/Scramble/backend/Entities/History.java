package com.Scramble.backend.Entities;

import javax.persistence.*;

@Entity
public class History {
    @Id
    @GeneratedValue
    private long idHistory;

    private long restaurantIdRestaurant;

    public History(long idHistory, long restaurantIdRestaurant) {
        this.idHistory = idHistory;
        this.restaurantIdRestaurant = restaurantIdRestaurant;
    }

    public long getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(long idHistory) {
        this.idHistory = idHistory;
    }

    public long getRestaurantIdRestaurant() {
        return restaurantIdRestaurant;
    }

    public void setRestaurantIdRestaurant(long restaurantIdRestaurant) {
        this.restaurantIdRestaurant = restaurantIdRestaurant;
    }
}
