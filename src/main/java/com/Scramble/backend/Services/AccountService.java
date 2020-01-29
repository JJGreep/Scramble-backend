package com.Scramble.backend.Services;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Models.AccountDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {

    Account save(AccountDto user);

    List<Account> findAll();

    void delete(int id);

    Account findOne(String username);

    Account findById(int id);

    AccountDto update(AccountDto user);

}
