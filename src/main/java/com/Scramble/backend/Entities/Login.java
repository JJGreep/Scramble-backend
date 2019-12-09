package com.Scramble.backend.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
    @Id
    private long username;
    private String password;

    public Login() {
        this.username = username;
        this.password = password;
    }

    public long getUsername() {
        return username;
    }

    public void setUsername(long username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
