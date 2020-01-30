package com.Scramble.backend.Controllers;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping(value = "/accounts", produces = "application/json")
public class AccountController {

    private final AccountRepo accountRepo;

    public AccountController(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    // TODO: Get Account info with username and password.
    @GetMapping(produces = "application/json")
    @ResponseBody
    List<Account> findAllAccounts(@RequestParam( required= false) String userName) {
        if (userName != null && !userName.isEmpty()) {
            List<Account> oneAccount = new ArrayList<>();
            oneAccount.add(accountRepo.findByUserName(userName));
            return oneAccount;
        } else {
            return accountRepo.findAll();
        }
    }



    @GetMapping(value = "/{id}", produces = "application/json")
    @ResponseBody
    Account findAccountById(@PathVariable long id) {
        return accountRepo.findById(id).orElseThrow(() -> new RuntimeException("User not found on :: " + id));
    }

    /**
     * Create account account.
     *
     * @param account the account
     * @return the account
     */
    @PostMapping("/accounts")
    Account createAccount(@Valid @RequestBody Account account) {



        return accountRepo.save(account);
    }

    /**
     * Update user response entity.
     *
     * @param id             the user id
     * @param accountDetails the user details
     * @return the response entity
     * @throws RuntimeException the resource not found exception
     */



    @PutMapping("/accounts/{id}")
    ResponseEntity<Account> updateAccount(@PathVariable(value = "id") Long id,
                                          @Valid @RequestBody Account accountDetails) {
        Account account = accountRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found on :: " + id));
        account.setEmail(accountDetails.getEmail());
        account.setEatGroups(accountDetails.getEatGroups());
        account.setUserName(accountDetails.getUserName());
        account.setPassword(accountDetails.getPassword());
        account.setFavRestaurantDbs(accountDetails.getFavRestaurantDbs());
        account.setHistory(accountDetails.getHistory());
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
    Map<String, Boolean> deleteAccount(@PathVariable(value = "id") Long id) {
        Account account = accountRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found on :: " + id));
        accountRepo.delete(account);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
