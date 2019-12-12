package com.Scramble.backend.Entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Account {
    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String email;

    @Column
    private String userName;

    @Column
    private String password;

    @ManyToMany
    @JoinTable(
            name = "account_eat_group",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "eat_group_id"))
    List<EatGroup> eatGroups;

    @ManyToMany
    @JoinTable(
            name = "favorites",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
    List<Restaurant> favRestaurants;

    @ManyToMany
    @JoinTable(
            name = "history",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
    List<Restaurant> history;

    public Account(){
    }

    public Account(String email, List<EatGroup> eatGroups, String userName, String password, List<Restaurant> favRestaurants, List<Restaurant> history) {
        this.email = email;
        this.eatGroups = eatGroups;
        this.userName = userName;
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

    public List<EatGroup> getEatGroups() {
        return eatGroups;
    }

    public void setEatGroups(List<EatGroup> groups) {
        this.eatGroups = eatGroups;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) { this.userName = userName; }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Restaurant> getFavRestaurants() {
        return favRestaurants;
    }

    public void setFavRestaurants(List<Restaurant> favRestaurants) {
        this.favRestaurants = favRestaurants;
    }

    public List<Restaurant> getHistory() {
        return history;
    }

    public void setHistory(List<Restaurant> history) {
        this.history = history;
    }
}
