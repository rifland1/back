package com.tuto.security.repository;

import com.tuto.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Rifland on 03/10/2019.
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
