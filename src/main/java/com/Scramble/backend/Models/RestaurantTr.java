package com.Scramble.backend.Models;

import java.util.Objects;


public class RestaurantTr {
    String id;
    String name;
    String url;
    String cuisines;
    Integer price_range;
    String photo_url;

    public RestaurantTr() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Integer getPrice_range() {
        return price_range;
    }

    public void setPrice_range(Integer price_range) {
        this.price_range = price_range;
    }

    public String getPhoto_url() { return photo_url; }

    public void setPhoto_url(String photo_url){ this.photo_url = photo_url; }



    public RestaurantTr(String id, String name, String url, String cuisines, Integer price_range, String photo_url) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.cuisines = cuisines;
        this.price_range = price_range;
        this.photo_url = photo_url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RestaurantTr that = (RestaurantTr) o;
        return Objects.equals(id, that.id) &&
                price_range == that.price_range &&
                Objects.equals(name, that.name) &&
                Objects.equals(url, that.url) &&
                Objects.equals(cuisines, that.cuisines) &&
                Objects.equals(photo_url, that.photo_url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, url, cuisines, price_range, photo_url);
    }
}
