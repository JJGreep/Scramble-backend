package com.Scramble.backend.Transformers;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Entities.EatGroup;
import com.Scramble.backend.Entities.RestaurantDb;
import com.Scramble.backend.Models.AccountTr;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;


import java.util.ArrayList;
import java.util.List;

public class AccountTransformerTest {


    @Test
    public void TransformTestTwo() {
        //given
        Account account = new Account();
        EatGroup eatGroup = new EatGroup();
        List<EatGroup> eatGroups = new ArrayList<>();
        RestaurantDb restaurantDb = new RestaurantDb();
        List<RestaurantDb> restaurantDbs = new ArrayList<>();
        //List<Account> accounts = new ArrayList<>();
        eatGroup.setId(1);
        eatGroup.setName("testgroup");
        eatGroups.add(eatGroup);
        account.setId(1);
        account.setUserName("Moestuin");
        account.setEmail("test@test.nl");
        account.setEatGroups(eatGroups);
        restaurantDb.setId(1);
        restaurantDbs.add(restaurantDb);
        account.setHistory(restaurantDbs);
        account.setFavRestaurantDbs(restaurantDbs);
        account.setPassword("test1234");
        //accounts.add(account);
        AccountTransformer accountTransformer = new AccountTransformer();

        //when
        //List<AccountTr> result = accountTransformer.Transform(accounts);
        AccountTr result2 = accountTransformer.TransformOne(account);


        //then
      //  assertThat(result, hasSize(1));
      //  assertThat(result, hasItem(new AccountTr(1, "test@test.nl", "Moestuin", new ArrayList<EatGroup>(List.of(new EatGroup(1, "testgroup"))), new ArrayList<RestaurantDb>(List.of(new RestaurantDb(1))), new ArrayList<RestaurantDb>(List.of(new RestaurantDb(1))))));
      //  assertThat(result, hasItem(new AccountTr(1, "test@test.nl", "Moestuin", eatGroups, restaurantDbs, restaurantDbs)));
        assertThat(result2, equalTo(new AccountTr(1, "test@test.nl", "Moestuin", new ArrayList<EatGroup>(List.of(new EatGroup(1, "testgroup"))), new ArrayList<RestaurantDb>(List.of(new RestaurantDb(1))), new ArrayList<RestaurantDb>(List.of(new RestaurantDb(1))))));

    }
    }

