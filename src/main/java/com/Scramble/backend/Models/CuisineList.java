package com.Scramble.backend.Models;

import java.util.List;
import java.util.Objects;

public class CuisineList {
    private List<Cuisine>cuisines;

    public List<Cuisine> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<Cuisine> cuisines) {
        this.cuisines = cuisines;
    }

    public CuisineList(List<Cuisine> cuisines) {
        this.cuisines = cuisines;
    }

    public CuisineList() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuisineList that = (CuisineList) o;
        return Objects.equals(cuisines, that.cuisines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuisines);
    }

    @Override
    public String toString() {
        return "CuisineList{" +
                "cuisines=" + cuisines +
                '}';
    }
}
