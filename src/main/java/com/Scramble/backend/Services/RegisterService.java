package com.Scramble.backend.Services;
import com.Scramble.backend.Repositories.RegisterRepo;
import com.Scramble.backend.Entities.Account;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.Scramble.backend.Controllers.AccountController;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;
public class RegisterService{
    @Autowired
    private RegisterRepo registerRepo;

    @Transactional
    public static Account loadAccountByUsername(String username) throws NotFoundException {
        Account account = (Account) registerRepo.findByUserName(username);
        if(account == null) throw new NotFoundException(username);
        return new Account();
    }
}
