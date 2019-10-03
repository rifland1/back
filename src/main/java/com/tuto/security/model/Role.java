package com.tuto.security.model;

import javax.persistence.*;

/**
 * Created by Rifland on 02/10/2019.
 */
@Entity
@Table(name = "ROLES")
public class Role {

    @Id
    private Integer id;

    private String name;

    public Role() {}

    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
