package com.tuto.security.repository;

import com.tuto.security.model.UsersRoles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Rifland on 03/10/2019.
 */
public interface UsersRolesRepository extends JpaRepository<UsersRoles, Integer> {


    @Query(
            value = "SELECT * FROM USERS_ROLES ur WHERE ur.id_user = ?1",
            nativeQuery = true)
    List<UsersRoles> findAllUsersRolesByIdUser(Integer idUser);
}
