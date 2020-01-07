package com.Scramble.backend.Repositories;

import com.Scramble.backend.Entities.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepo extends CrudRepository<Account, Long> {

    List<Account> findByUserName(String userName);
    List<Account> findByConfirmationToken(String confirmationToken);
    List<Account> findAll();
}
