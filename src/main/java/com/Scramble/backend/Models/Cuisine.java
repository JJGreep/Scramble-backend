package com.Scramble.backend.Models;

import java.util.Objects;

public class Cuisine {
   private CuisineDetails cuisine;

    public Cuisine() {
    }

    public Cuisine(CuisineDetails cuisine) {
        this.cuisine = cuisine;
    }

    public CuisineDetails getCuisine() {
        return cuisine;
    }

    public void setCuisine(CuisineDetails cuisine) {
        this.cuisine = cuisine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuisine cuisine1 = (Cuisine) o;
        return Objects.equals(cuisine, cuisine1.cuisine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuisine);
    }

    @Override
    public String toString() {
        return "Cuisine{" +
                "cuisine=" + cuisine +
                '}';
    }
}
