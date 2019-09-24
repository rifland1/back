package com.tuto.security.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import com.tuto.security.service.UserDetailsServiceImpl;
/**
 * Created by Rifland on 18/09/2019.
 */
public class ImplAuthProvider extends DaoAuthenticationProvider {

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;
        String name = auth.getName();
        String password = auth.getCredentials().toString();
        UserDetails userDetails = userDetailsService.loadUserByUsername(name);
        if (userDetails == null) {
            throw new BadCredentialsException("Nom d'utilisateur et / ou mot de passe incorrect");
        }
        return new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
