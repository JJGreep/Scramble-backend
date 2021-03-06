package com.Scramble.backend.Models;

import com.Scramble.backend.Entities.Account;

import java.util.List;

public class CreateEatGroup {

    private String name;
    private List<Account> accounts;

    public CreateEatGroup(String name) {
        this.name = name;
    }

    public CreateEatGroup() {
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
