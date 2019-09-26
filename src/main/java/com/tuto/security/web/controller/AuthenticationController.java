package com.tuto.security.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Rifland on 18/09/2019.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200",  maxAge = 3600)
public class AuthenticationController {

}
