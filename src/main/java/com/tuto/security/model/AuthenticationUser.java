package com.tuto.security.model;

/**
 * Created by Rifland on 30/09/2019.
 */
public class AuthenticationUser {

    private Integer id;

    private String username;


    public AuthenticationUser(Integer id, String username) {
        this.id = id;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
