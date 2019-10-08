package com.tuto.security.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Rifland on 08/10/2019.
 */
@RestController
public class UserController {

    @RequestMapping("/api/user")
    public String user() {
        return "{\"data\":\"Hello, vous êtes bien en page User\"}";
    }
}
