package com.Scramble.backend.Transformers;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Models.AccountTr;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountTransformer {

    public List<AccountTr> Transform(List<Account> accounts){
            List<AccountTr> accountTrs = new ArrayList<>();
            int i;
            for (i=0;i<accounts.size();i++){
                AccountTr accountTr = new AccountTr();
                accountTr.setId(accounts.get(i).getId());
                accountTr.setUserName(accounts.get(i).getUserName());
                accountTr.setEmail(accounts.get(i).getEmail());
                accountTr.setEatGroups(accounts.get(i).getEatGroups());
                accountTr.setFavRestaurantsDb(accounts.get(i).getFavRestaurantDbs());
                accountTr.setHistory(accounts.get(i).getHistory());
                accountTrs.add(accountTr);
            }
            return accountTrs;
    }


    public AccountTr TransformOne (Account account){
        AccountTr accountTr = new AccountTr();
        accountTr.setId(account.getId());
        accountTr.setEatGroups(account.getEatGroups());
        accountTr.setEmail(account.getEmail());
        accountTr.setFavRestaurantsDb(account.getFavRestaurantDbs());
        accountTr.setHistory(account.getHistory());
        accountTr.setUserName(account.getUserName());
        return accountTr;
    }
}
