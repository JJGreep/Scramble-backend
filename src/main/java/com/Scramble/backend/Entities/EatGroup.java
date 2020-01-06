package com.Scramble.backend.Entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EatGroup)) return false;
        EatGroup eatGroup = (EatGroup) o;
        return getId() == eatGroup.getId() &&
                Objects.equals(getName(), eatGroup.getName()) &&
                Objects.equals(getAccounts(), eatGroup.getAccounts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAccounts());
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
