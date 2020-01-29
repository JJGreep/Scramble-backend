package com.Scramble.backend.Models;


import java.util.Objects;

public class Filter {

    private Integer start;
    private Integer count;
    private String cuisines;
    private Integer radius;
    private Double lat;
    private Double lon;

    public Filter(){

    }

    public Filter(Integer start, Integer count, String cuisines, Integer radius, Double lat, Double lon){
        this.start = start;
        this.count = count;
        this.cuisines = cuisines;
        this.radius = radius;
        this.lat = lat;
        this.lon = lon;
    }

    public Integer getStart() {
        return start;
    }

    public Integer getCount() {
        return count;
    }

    public String getCuisines() {
        return cuisines;
    }

    public Integer getRadius() {
        return radius;
    }

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filter filter = (Filter) o;
        return Objects.equals(start, filter.start) &&
                Objects.equals(count, filter.count) &&
                Objects.equals(cuisines, filter.cuisines) &&
                Objects.equals(radius, filter.radius) &&
                Objects.equals(lat, filter.lat) &&
                Objects.equals(lon, filter.lon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, count, cuisines, radius, lat, lon);
    }
}
