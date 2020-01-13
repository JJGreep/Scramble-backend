package com.Scramble.backend.Models;

public class CreateEatGroup {

    private String name;

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

}
