package com.Scramble.backend.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column
    private String email;

    @Column
    private String userName;

    @Column
    private String password;

    @JsonBackReference
    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(name = "account_eat_group", joinColumns = @JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "eat_group_id"))
    private List<EatGroup> eatGroups;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(name = "favorites", joinColumns = @JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
    private List<RestaurantDb> favRestaurantDbs;

    @ManyToMany(cascade = CascadeType.REMOVE)
    @JoinTable(name = "history", joinColumns = @JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
    private List<RestaurantDb> history;

    public Account() {
    }

    public Account(String email, List<EatGroup> eatGroups, String userName, String password,
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
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return getId() == account.getId() &&
                Objects.equals(getEmail(), account.getEmail()) &&
                Objects.equals(getUserName(), account.getUserName()) &&
                Objects.equals(getPassword(), account.getPassword()) &&
                Objects.equals(getEatGroups(), account.getEatGroups()) &&
                Objects.equals(getFavRestaurantDbs(), account.getFavRestaurantDbs()) &&
                Objects.equals(getHistory(), account.getHistory());
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

    public void removeEatGroup(EatGroup eatgroup){
        eatGroups.remove(eatgroup);
    }


}
