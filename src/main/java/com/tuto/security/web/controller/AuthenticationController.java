package com.tuto.security.web.controller;

import com.tuto.security.model.AuthenticationUser;
import com.tuto.security.model.User;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created by Rifland on 18/09/2019.
 */
@RestController
public class AuthenticationController {


    @RequestMapping("/api/auth")
    public AuthenticationUser user(Principal user) {
        User u = (User) ((UsernamePasswordAuthenticationToken) user).getPrincipal();
        AuthenticationUser authenticationUser = new AuthenticationUser(u.getId(), u.getUsername(), u.getRoles());
        return authenticationUser;
    }

}
