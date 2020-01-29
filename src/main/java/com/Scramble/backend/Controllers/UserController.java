package com.Scramble.backend.Controllers;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Models.AccountDto;
import com.Scramble.backend.Models.ApiResponse;
import com.Scramble.backend.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ApiResponse<Account> saveUser(@RequestBody AccountDto user) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.", accountService.save(user));
    }

    @GetMapping
    public ApiResponse<List<Account>> listUser() {
        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.", accountService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<Account> getOne(@PathVariable int id) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.", accountService.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<AccountDto> update(@RequestBody AccountDto userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.", accountService.update(userDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        accountService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }
}

