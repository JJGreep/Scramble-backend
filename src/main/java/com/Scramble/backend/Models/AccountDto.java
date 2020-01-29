package com.Scramble.backend.Models;

import com.Scramble.backend.Entities.EatGroup;
import com.Scramble.backend.Entities.RestaurantDb;

import java.util.List;
import java.util.Objects;

public class AccountDto {

    private long id;
    private String email;
    private String userName;
    private String password;

    private List<EatGroup> eatGroups;
    private List<RestaurantDb> favRestaurantDbs;
    private List<RestaurantDb> history;

    public AccountDto() {
    }

    public AccountDto(String email, List<EatGroup> eatGroups, String userName, String password,
                   List<RestaurantDb> favRestaurantDbs, List<RestaurantDb> history) {
        this.email = email;
        this.eatGroups = eatGroups;
        this.userName = userName;
        this.favRestaurantDbs = favRestaurantDbs;
        this.password = password;

        this.history = history;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountDto)) return false;
        AccountDto accountDto = (AccountDto) o;
        return getId() == accountDto.getId() &&
                Objects.equals(getEmail(), accountDto.getEmail()) &&
                Objects.equals(getUserName(), accountDto.getUserName()) &&
                Objects.equals(getPassword(), accountDto.getPassword()) &&
                Objects.equals(getEatGroups(), accountDto.getEatGroups()) &&
                Objects.equals(getFavRestaurantDbs(), accountDto.getFavRestaurantDbs()) &&
                Objects.equals(getHistory(), accountDto.getHistory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmail(), getUserName(), getPassword(), getEatGroups(), getFavRestaurantDbs(), getHistory());
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

    public List<EatGroup> getEatGroups() {
        return eatGroups;
    }

    public void setEatGroups(List<EatGroup> eatGroups) {
        this.eatGroups = eatGroups;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RestaurantDb> getFavRestaurantDbs() {
        return favRestaurantDbs;
    }

    public void setFavRestaurantDbs(List<RestaurantDb> favRestaurantDbs) {
        this.favRestaurantDbs = favRestaurantDbs;
    }

    public List<RestaurantDb> getHistory() {
        return history;
    }

    public void setHistory(List<RestaurantDb> history) {
        this.history = history;
    }
}
