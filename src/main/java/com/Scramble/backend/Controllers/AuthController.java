package com.Scramble.backend.Controllers;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Config.JwtTokenUtil;
import com.Scramble.backend.Models.ApiResponse;
import com.Scramble.backend.Models.AuthToken;
import com.Scramble.backend.Models.LoginAccount;
import com.Scramble.backend.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/token")

public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private AccountService accountService;


    @RequestMapping(value = "/generate-token", method = RequestMethod.POST)
    public ApiResponse<AuthToken> register(@RequestBody LoginAccount loginAccount) throws AuthenticationException {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginAccount.getUsername(),
                        loginAccount.getPassword()));
        final Account user = accountService.findOne(loginAccount.getUsername());
        final String token = jwtTokenUtil.generateToken(user);
        return new ApiResponse<>(200, "success", new AuthToken(token, user.getUserName()));
    }

}
