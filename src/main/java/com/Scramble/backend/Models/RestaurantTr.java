package com.Scramble.backend.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;


public class RestaurantTr {
    int id;
    String name;
    String url;
    String cuisines;
    int price_range;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public int getPrice_range() {
        return price_range;
    }

    public void setPrice_range(int price_range) {
        this.price_range = price_range;
    }

    public RestaurantTr(){

    }

    public RestaurantTr(int id, String name, String url, String cuisines, int price_range) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.cuisines = cuisines;
        this.price_range = price_range;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantTr that = (RestaurantTr) o;
        return id == that.id &&
                price_range == that.price_range &&
                Objects.equals(name, that.name) &&
                Objects.equals(url, that.url) &&
                Objects.equals(cuisines, that.cuisines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, url, cuisines, price_range);
    }
}
