package com.Scramble.backend.Services;
import javassist.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl {

    private AuthenticationManager authenticationManager;

    private RegisterService registerService;

    private static final Logger logger = LoggerFactory.getLogger(SecurityServiceImpl.class);
    private Object UserDetails;
    private Object UsernamePasswordAuthenticationToken;

    public String findLoggedInUsername(){
        Object UserDetails = SecurityContextHolder.getContext().getAuthentication().getDetails();
        if(UserDetails instanceof UserDetails){
            return ((UserDetails)UserDetails).getUsername();
        }
        return null;
    }

    public void Autologin(String username, String password) throws NotFoundException {
        UserDetails userDetails = (UserDetails) RegisterService.loadAccountByUsername(username);
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(UserDetails, password);

        authenticationManager.authenticate((Authentication) UsernamePasswordAuthenticationToken);
        if (usernamePasswordAuthenticationToken.isAuthenticated()) {
            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            logger.debug(String.format("Auto login %s successfully!", username));
        }
    }



}
