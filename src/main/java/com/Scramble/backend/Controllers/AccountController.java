package com.Scramble.backend.Controllers;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping(value = "/accounts", produces = "application/json")
public class AccountController {

    @Autowired
    private AccountRepo accountRepo;


    //TODO: Get Account info with username and password.
    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<Account> findAllAccounts(@RequestParam Optional<String> userName){
        if(userName.isPresent()){
            return accountRepo.findByUserName(userName.get());
        }
        else{
            return accountRepo.findAll();
        }
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseBody
    public Account findAccountById(@PathVariable long id) {
        return accountRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found on :: " + id));
    }

    /**
     * Create account account.
     *
     * @param account the account
     * @return the account
     */
    @PostMapping("/accounts")
    public Account createAccount(@Valid @RequestBody Account account) {
        return accountRepo.save(account);
    }

    /**
     * Update user response entity.
     *
     * @param id the user id
     * @param accountDetails the user details
     * @return the response entity
     * @throws RuntimeException the resource not found exception
     */
    @PutMapping("/accounts/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable(value = "id") Long id, @Valid @RequestBody Account accountDetails){
        Account account =
                accountRepo
                    .findById(id)
                    .orElseThrow(() -> new RuntimeException("User not found on :: " + id));
        account.setEmail(account.getEmail());
        account.setEatGroups(account.getEatGroups());
        account.setUserName(account.getUserName());
        account.setPassword(account.getPassword());
        account.setFavRestaurants(account.getFavRestaurants());
        account.setHistory(account.getHistory());
        final Account updatedAccount = accountRepo.save(account);
        return ResponseEntity.ok(updatedAccount);
    }

    /**
     * Delete user map.
     *
     * @param id the account id
     * @return the map
     * @throws RuntimeException the exception
     */
    @DeleteMapping("/accounts/{id}")
    public Map<String, Boolean> deleteAccount(@PathVariable(value = "id") Long id){
        Account account =
                accountRepo
                    .findbyId(id)
                    .orElseThrow(() -> new RuntimeException("User not found on :: " + id));
        accountRepo.delete(account);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    //TODO: Possibly separate Controllers for History and Favorites, using id from Account (Sessions?).
}
