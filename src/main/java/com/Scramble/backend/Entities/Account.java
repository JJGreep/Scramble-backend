package com.Scramble.backend.Entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
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
            name = "account_eat_Group",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "eat_group_id"))
    List<EatGroup> eatGroups;

    @ManyToMany
    @JoinTable(
            name = "Favorites",
            joinColumns = @JoinColumn(name = "account_id"),
            inverseJoinColumns = @JoinColumn(name = "restaurant_id"))
    List<Restaurant> favRestaurants;

    @ManyToMany
    @JoinTable(
            name = "History",
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


    public class AccountPrincipal implements UserDetails {
        private Account account;
        private long id;
        private String email;
        private List<EatGroup> eatGroups;
        private String userName;
        private String password;
        private List<Restaurant> favRestaurants;
        private List<Restaurant> history;

        public AccountPrincipal(Account account) {
            super();
            this.account = account;
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {

            return Collections.singleton(new SimpleGrantedAuthority("USER"));

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

        @Override
        public String getUsername() {
            return null;
        }

        @Override
        public boolean isAccountNonExpired() {
            return false;
        }

        @Override
        public boolean isAccountNonLocked() {
            return false;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return false;
        }

        @Override
        public boolean isEnabled() {
            return false;
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
}}
