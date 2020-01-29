package com.Scramble.backend.Models;

import java.util.Objects;

public class CuisineDetails {
    private String cuisine_id;

    private String cuisine_name;

    public CuisineDetails() {
    }

    public CuisineDetails(String cuisine_id, String cuisine_name) {
        this.cuisine_id = cuisine_id;
        this.cuisine_name = cuisine_name;
    }

    public String getCuisine_id() {
        return cuisine_id;
    }

    public void setCuisine_id(String cuisine_id) {
        this.cuisine_id = cuisine_id;
    }

    public String getCuisine_name() {
        return cuisine_name;
    }

    public void setCuisine_name(String cuisine_name) {
        this.cuisine_name = cuisine_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuisineDetails cuisine = (CuisineDetails) o;
        return Objects.equals(cuisine_id, cuisine.cuisine_id) &&
                Objects.equals(cuisine_name, cuisine.cuisine_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuisine_id, cuisine_name);
    }
}
