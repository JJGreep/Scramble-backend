package com.Scramble.backend.Models;

import com.Scramble.backend.Entities.*;


import java.util.List;
import java.util.Objects;

public class AccountTr {
    private long id;
    private String email;
    private String userName;
    private List<EatGroup> eatGroups;
    private List<RestaurantDb> favRestaurants;
    private List<RestaurantDb> history;

    public AccountTr(){

    }

    public AccountTr(long id, String email, String userName, List<EatGroup> eatGroups, List<RestaurantDb> favRestaurants, List<RestaurantDb> history) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.eatGroups = eatGroups;
        this.favRestaurants = favRestaurants;
        this.history = history;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<EatGroup> getEatGroups() {
        return eatGroups;
    }

    public void setEatGroups(List<EatGroup> eatGroups) {
        this.eatGroups = eatGroups;
    }

    public List<RestaurantDb> getFavRestaurantsDb() {
        return favRestaurants;
    }

    public void setFavRestaurantsDb(List<RestaurantDb> favRestaurantDbs) {
        this.favRestaurants = favRestaurantDbs;
    }

    public List<RestaurantDb> getHistory() {
        return history;
    }

    public void setHistory(List<RestaurantDb> history) {
        this.history = history;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountTr)) return false;
        AccountTr accountTr = (AccountTr) o;
        return getId() == accountTr.getId() &&
                Objects.equals(getEmail(), accountTr.getEmail()) &&
                Objects.equals(getUserName(), accountTr.getUserName()) &&
                Objects.equals(getEatGroups(), accountTr.getEatGroups()) &&
                Objects.equals(favRestaurants, accountTr.favRestaurants) &&
                Objects.equals(getHistory(), accountTr.getHistory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmail(), getUserName(), getEatGroups(), favRestaurants, getHistory());
    }
}
