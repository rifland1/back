package com.tuto.security.web.controller;

import com.tuto.security.model.AuthenticationUser;
import com.tuto.security.model.User;
import com.tuto.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rifland on 08/10/2019.
 */
@RestController
public class AdminController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/api/admin")
    public String admin() {
        return "{\"data\":\"Hello, vous êtes bien en page Admin\"}";
    }


    @RequestMapping("/api/admin/users")
    public List<AuthenticationUser> getUsers() {
        List<AuthenticationUser> authenticationUsers = new ArrayList<>();
        List<User> users = userRepository.findAll();
        for (User u : users) {
            authenticationUsers.add(new AuthenticationUser(u.getId(), u.getUsername(), u.getRoles()));
        }
        return authenticationUsers;
    }

}
