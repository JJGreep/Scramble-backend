package com.Scramble.backend.Models;

import javax.persistence.Entity;


public class UserRating {
    Number aggregrate_rating;
    String rating_text;
    String rating_color;
    int votes;

    public Number getAggregrate_rating() {
        return aggregrate_rating;
    }

    public void setAggregrate_rating(Number aggregrate_rating) {
        this.aggregrate_rating = aggregrate_rating;
    }

    public String getRating_text() {
        return rating_text;
    }

    public void setRating_text(String rating_text) {
        this.rating_text = rating_text;
    }

    public String getRating_color() {
        return rating_color;
    }

    public void setRating_color(String rating_color) {
        this.rating_color = rating_color;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public UserRating() {

    }

    public UserRating(Number aggregrate_rating, String rating_text, String rating_color, int votes) {
        this.aggregrate_rating = aggregrate_rating;
        this.rating_text = rating_text;
        this.rating_color = rating_color;
        this.votes = votes;
    }
}
