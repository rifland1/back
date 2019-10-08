package com.tuto.security.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.persistence.*;

/**
 * Created by Rifland on 02/10/2019.
 */
@Entity
@Table(name = "ROLES")
public class Role implements GrantedAuthority {

    @Id
    private Integer id;

    private String authority;

    public Role() {}

    public Role(Integer id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
