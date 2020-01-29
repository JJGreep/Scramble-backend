package com.Scramble.backend.Services;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Models.AccountDto;
import com.Scramble.backend.Repositories.AccountRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService, UserDetailsService {

    @Autowired
    private AccountRepo accountRepo;

    @Autowired
    private BCryptPasswordEncoder bcryptEncoder;


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account user = accountRepo.findByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), getAuthority());
    }

    private List<SimpleGrantedAuthority> getAuthority() {
        return Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public Account save(AccountDto user) {
        Account newUser = new Account();
        newUser.setUserName(user.getUserName());
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        newUser.setEmail(user.getEmail());
        newUser.setEatGroups(null);
        newUser.setFavRestaurantDbs(null);
        newUser.setHistory(null);
        return accountRepo.save(newUser);
    }

    @Override
    public AccountDto update(AccountDto userDto) {
        Account user = findById((int) userDto.getId());
        if(user != null) {
            BeanUtils.copyProperties(userDto, user, "password");
            accountRepo.save(user);
        }
        return userDto;

    }

    public List<Account> findAll() {
        List<Account> list = new ArrayList<>();
        accountRepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public void delete(int id) {
        accountRepo.deleteById((long) id);
    }

    @Override
    public Account findOne(String username) {
        return accountRepo.findByUserName(username);
    }

    @Override
    public Account findById(int id) {
        Optional<Account> optionalUser = accountRepo.findById((long) id);
        return optionalUser.orElse(null);
    }


}


