package com.Scramble.backend.Services;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;
import java.util.List;

@Service
public class MyAccountDetailsService implements UserDetailsService {

    @Autowired
    private AccountRepo repo;
    private UserPrincipal userPrincipal;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        List<Account> account = repo.findByUserName(username);
        if(account==null)
            throw new UsernameNotFoundException("User 404");
        return (UserDetails) userPrincipal;
    }
}
