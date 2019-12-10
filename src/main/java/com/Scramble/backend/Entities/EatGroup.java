package com.Scramble.backend.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class EatGroup {
    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "eatGroups")
    List<Account> accounts;

    public EatGroup(){}

    public EatGroup(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
