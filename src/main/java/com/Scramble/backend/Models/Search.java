package com.Scramble.backend.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import java.util.ArrayList;


public class Search {
    @JsonProperty
    int results_found;
    @JsonProperty
    int results_start;
    @JsonProperty
    int results_shown;
    @JsonProperty
    ArrayList<Restaurant> restaurants;

    public int getResults_found() {
        return results_found;
    }

    public void setResults_found(int results_found) {
        this.results_found = results_found;
    }

    public int getResults_start() {
        return results_start;
    }

    public void setResults_start(int results_start) {
        this.results_start = results_start;
    }

    public int getResults_shown() {
        return results_shown;
    }

    public void setResults_shown(int results_shown) {
        this.results_shown = results_shown;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public Search(){

    }

    public Search(int results_found, int results_start, int results_shown, ArrayList<Restaurant> restaurants) {
        this.results_found = results_found;
        this.results_start = results_start;
        this.results_shown = results_shown;
        this.restaurants = restaurants;
    }
}
