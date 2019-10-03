package com.tuto.security.service;

import com.tuto.security.model.Role;
import com.tuto.security.model.User;
import com.tuto.security.model.UsersRoles;
import com.tuto.security.repository.RoleRepository;
import com.tuto.security.repository.UserRepository;
import com.tuto.security.repository.UsersRolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Created by Rifland on 18/09/2019.
 */
@Service
@Component("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final UsersRolesRepository usersRolesRepository;

    @Autowired
    public UserDetailsServiceImpl(UserRepository userRepository, RoleRepository roleRepository, UsersRolesRepository usersRolesRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.usersRolesRepository = usersRolesRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Objects.requireNonNull(username);
        User user = userRepository.findUserWithName(username)
                .orElseThrow(() -> new UsernameNotFoundException("utilisateur non trouvé"));
        List<UsersRoles> usersRoles = usersRolesRepository.findAllUsersRolesByIdUser(user.getId());
        for (UsersRoles ur : usersRoles) {
            Integer idrole = ur.getId_role();
            Optional<Role> role = roleRepository.findById(idrole);
            if (role.isPresent()) {
                user.addRole(role.get());
            }
        }
        return user;
    }
}
