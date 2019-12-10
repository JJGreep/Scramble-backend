package com.Scramble.backend.Controllers;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/accounts", produces = "application/json")
public class AccountController {

    @Autowired
    private AccountRepo accountRepo;


    //TODO: Get Account info with username and password.
//    @GetMapping(produces = "application/json")
//    @ResponseBody
//    public List<Account> findAll(@RequestParam Optional<String> userName){
//        if(userName.isPresent()){
//            return accountRepo.findByName(userName.get());
//        }
//        else{
//            return accountRepo.findAll();
//        }
//    }

    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseBody
    public Account findById(@PathVariable long id) {
        return accountRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found on :: " + id));
    }

    //TODO: Possibly separate Controllers for History and Favorites, using id from Account (Sessions?).
}
