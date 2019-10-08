package com.tuto.security.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rifland on 30/09/2019.
 */
public class AuthenticationUser {

    private Integer id;

    private String username;

    private List<Role> roles = new ArrayList<Role>();


    public AuthenticationUser(Integer id, String username, List<Role> roles) {
        this.id = id;
        this.username = username;
        this.roles = roles;
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

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
