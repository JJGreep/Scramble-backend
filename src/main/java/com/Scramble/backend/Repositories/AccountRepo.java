package com.Scramble.backend.Repositories;

import com.Scramble.backend.Entities.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountRepo extends CrudRepository<Account, Long> {

    Account findByUserName(String userName);
    List<Account> findAll();
}
