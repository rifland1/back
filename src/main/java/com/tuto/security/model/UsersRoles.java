package com.tuto.security.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Rifland on 03/10/2019.
 */
@Entity
@Table(name = "USERS_ROLES")
public class UsersRoles {

    @Id
    private Integer id;

    private Integer id_user;

    private Integer id_role;

    public UsersRoles() {
    }


    public UsersRoles(Integer id_user, Integer id_role) {
        this.id_user = id_user;
        this.id_role = id_role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_role() {
        return id_role;
    }

    public void setId_role(Integer id_role) {
        this.id_role = id_role;
    }
}
