package com.Scramble.backend.Entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Account {
    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String email;

    @ManyToMany(mappedBy = "")
    @JoinTable(
            name = "AccountEatGroup",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "eatGroup_id"))
    Set<EatGroup> eatGroups;

    @Column
    private long loginUsername;

    @Column
    private long favoriteIdFavorite;

    @Column
    private long historyIdHistory;

    public Account(){
    }

    public Account(String email, Set<EatGroup> eatGroups, long loginUsername, long favoriteIdFavorite, long historyIdHistory) {
        this.email = email;
        this.eatGroups = eatGroups;
        this.loginUsername = loginUsername;
        this.favoriteIdFavorite = favoriteIdFavorite;
        this.historyIdHistory = historyIdHistory;
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

    public Set<EatGroup> getEatGroups() {
        return eatGroups;
    }

    public void setEatGroups(Set<EatGroup> groups) {
        this.eatGroups = eatGroups;
    }

    public long getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(long loginUsername) {
        this.loginUsername = loginUsername;
    }

    public long getFavoriteIdFavorite() {
        return favoriteIdFavorite;
    }

    public void setFavoriteIdFavorite(long favoriteIdFavorite) {
        this.favoriteIdFavorite = favoriteIdFavorite;
    }

    public long getHistoryIdHistory() {
        return historyIdHistory;
    }

    public void setHistoryIdHistory(long historyIdHistory) {
        this.historyIdHistory = historyIdHistory;
    }
}
