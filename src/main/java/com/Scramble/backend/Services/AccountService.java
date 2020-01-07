package com.Scramble.backend.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Repositories.AccountRepo;

@Service
public class AccountService {

    private AccountRepo accountRepo;

    @Autowired
    public AccountService(AccountRepo accountRepo){
        this.accountRepo = accountRepo;
    }

    public Account findByUserName(String userName){
        return (Account) accountRepo.findByUserName(userName);
    }

    public Account findByConfirmationToken(String confirmationToken){
        return (Account) accountRepo.findByConfirmationToken(confirmationToken);
    }

    public void saveAccount(Account account){
        this.accountRepo.save(account);
    }
}
