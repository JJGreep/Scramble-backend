package com.Scramble.backend.Transformers;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Entities.EatGroup;
import com.Scramble.backend.Entities.RestaurantDb;
import com.Scramble.backend.Models.AccountTr;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;


class AccountTransformerTest {

    @Test
    void transform() {
        //given
        Account account = new Account();
        EatGroup eatGroup = new EatGroup();
        List<EatGroup> eatGroupsList = new ArrayList<>();
        RestaurantDb restaurantDb = new RestaurantDb();
        List<RestaurantDb> restaurantDbs = new ArrayList<>();
        List<Account> accountsList = new ArrayList<>();
        AccountTransformer accountTransformer = new AccountTransformer();
        AccountTr account_transformed2 = new AccountTr();
        List<AccountTr> accountTrList = new ArrayList<AccountTr>();

        eatGroup.setId(1L);
        eatGroup.setName("testgroup");
        eatGroupsList.add(eatGroup);
        account.setId(1);
        account.setUserName("Moestuin");
        account.setEmail("test@test.nl");
        account.setEatGroups(eatGroupsList);
        restaurantDb.setId(1);
        restaurantDbs.add(restaurantDb);
        account.setHistory(restaurantDbs);
        account.setFavRestaurantDbs(restaurantDbs);
        account.setPassword("test1234");
        accountsList.add(account);

        account_transformed2.setId(1);
        account_transformed2.setEmail("test@test.nl");
        account_transformed2.setUserName("Moestuin");
        account_transformed2.setEatGroups(eatGroupsList);
        account_transformed2.setHistory(restaurantDbs);
        account_transformed2.setFavRestaurantsDb(restaurantDbs);

        //when
        List<AccountTr> result = accountTransformer.Transform(accountsList);

        //then
        assertThat(result, hasSize(1));
        assertThat(result, hasItem(account_transformed2));
    }

    @Test
    void transformOne() {
        //given
        Account account = new Account();
        EatGroup eatGroup = new EatGroup();
        List<EatGroup> eatGroupsList = new ArrayList<>();
        RestaurantDb restaurantDb = new RestaurantDb();
        List<RestaurantDb> restaurantDbs = new ArrayList<>();
        AccountTransformer accountTransformer = new AccountTransformer();

        eatGroup.setId(1L);
        eatGroup.setName("testgroup");
        eatGroupsList.add(eatGroup);
        account.setId(1);
        account.setUserName("Moestuin");
        account.setEmail("test@test.nl");
        account.setEatGroups(eatGroupsList);
        restaurantDb.setId(1);
        restaurantDbs.add(restaurantDb);
        account.setHistory(restaurantDbs);
        account.setFavRestaurantDbs(restaurantDbs);
        account.setPassword("test1234");

        //when
        AccountTr result2 = accountTransformer.TransformOne(account);


        //then
        assertThat(result2, is(equalTo(new AccountTr(1, "test@test.nl", "Moestuin", new ArrayList<EatGroup>(List.of(new EatGroup(1, "testgroup"))), new ArrayList<RestaurantDb>(List.of(new RestaurantDb(1))), new ArrayList<RestaurantDb>(List.of(new RestaurantDb(1)))))));




    }
}
