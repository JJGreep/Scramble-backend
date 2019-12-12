package com.Scramble.backend.Services;
import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Repositories.AccountRepo;

public interface UserService {
    void save(Account account);

    Account.findByUsername(String username);
}
