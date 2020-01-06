package com.Scramble.backend.Controllers;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Entities.EatGroup;
import com.Scramble.backend.Entities.RestaurantDb;
import com.Scramble.backend.Repositories.AccountRepo;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountControllerTest {

    @Mock
    private AccountRepo accountRepo;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();


//    @Test
//    void testFindAccountById() throws Exception {
//        //Given
//        AccountController accountController = new AccountController(accountRepo);
//        List<EatGroup> eatGroups = new ArrayList<EatGroup>();
//        List<RestaurantDb> favRestaurants = new ArrayList<RestaurantDb>();
//        List<RestaurantDb> history = new ArrayList<RestaurantDb>();
//        Account account = new Account("test@test.nl", eatGroups, "Test", "test", favRestaurants, history);
//        when(accountRepo.findById(0L)).thenReturn(Optional.of(account));
//
//        //When
//        accountController.findAccountById(0L);
//
//        //Then
//        verify(accountRepo).findById(0L);
//    }
//
//    @Test
//    void testFindAllAccounts() throws Exception{
//        //Given
//        AccountController accountController = new AccountController(accountRepo);
//        List<Account> accountList = new ArrayList<Account>();
//        List<EatGroup> eatGroups = new ArrayList<EatGroup>();
//        List<RestaurantDb> favRestaurants = new ArrayList<RestaurantDb>();
//        List<RestaurantDb> history = new ArrayList<RestaurantDb>();
//        Account account1 = new Account("test@test.nl", eatGroups, "Test", "test", favRestaurants, history);
//        Account account2 = new Account("test2@test.nl", eatGroups, "Test2", "test2", favRestaurants, history);
//        accountList.add(account1);
//        accountList.add(account2);
//        //when(eatGroupRepo.findByName("PokoLoco")).thenReturn(groupList);
//        when(accountRepo.findAll()).thenReturn(accountList);
//
//        //When
//        accountController.findAllAccounts("");
//
//        //Then
//        verify(accountRepo).findAll();
//    }
//
//    //TODO: Test not correct
////    @Test
////    void testCreateAccount() throws Exception{
////        //Given
////        AccountController accountController = new AccountController(accountRepo);
////        List<EatGroup> eatGroups = new ArrayList<EatGroup>();
////        List<RestaurantDb> favRestaurants = new ArrayList<RestaurantDb>();
////        List<RestaurantDb> history = new ArrayList<RestaurantDb>();
////
////        //When
////        Account account = accountController.createAccount(new Account("test@test.nl", eatGroups, "Test", "test", favRestaurants, history));
////
////        //Then
////        verify(accountRepo).save(account);
////    }
//
//    @Test
//    void testUpdateAccount() throws Exception{
//        //Given
//        AccountController accountController = new AccountController(accountRepo);
//        List<EatGroup> eatGroups = new ArrayList<EatGroup>();
//        List<RestaurantDb> favRestaurants = new ArrayList<RestaurantDb>();
//        List<RestaurantDb> history = new ArrayList<RestaurantDb>();
//        Account account = new Account("test@test.nl", eatGroups, "Test", "test", favRestaurants, history);
//        when(accountRepo.findById(0L)).thenReturn(Optional.of(account));
//
//        //When
//        accountController.updateAccount(0L, account);
//
//        //Then
//        verify(accountRepo).save(account);
//    }
//
//    @Test
//    void testDeleteAccount() throws Exception{
//        //Given
//        AccountController accountController = new AccountController(accountRepo);
//        List<EatGroup> eatGroups = new ArrayList<EatGroup>();
//        List<RestaurantDb> favRestaurants = new ArrayList<RestaurantDb>();
//        List<RestaurantDb> history = new ArrayList<RestaurantDb>();
//        Account account = new Account("test@test.nl", eatGroups, "Test", "test", favRestaurants, history);
//        when(accountRepo.findById(0L)).thenReturn(Optional.of(account));
//
//        //When
//        accountController.deleteAccount(0L);
//
//        //Then
//        verify(accountRepo).delete(account);
//    }

}
