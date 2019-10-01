package com.tuto.security.web.controller;

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


    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public Object currentUserNameSimple(HttpServletRequest request) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            return (UserDetails)principal;
        } else {
            return  null;
        }
    }

}
