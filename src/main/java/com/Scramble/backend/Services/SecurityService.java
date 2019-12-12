package com.Scramble.backend.Services;
import com.Scramble.backend.Entities.Account;

public interface SecurityService {
    String findLoggedUsername();
    void autoLogin(String username, String password);
}
