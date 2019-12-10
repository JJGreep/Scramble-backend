package com.Scramble.backend.Controllers;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Repositories.AccountRepo;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class AccountControllerTest {
    private MockMvc mvc;
    private RequestBuilder requestBuilder;
    private JacksonTester<Account> jsonAccount;

    @Mock
    private AccountRepo accountRepo;

    @InjectMocks
    private AccountController accountController;

//    @Test
//    void findById() throws Exception {
//        //Given
//        List<EatGroup> groups = new ArrayList<EatGroup>();
//        List<Restaurant> favs = new ArrayList<Restaurant>();
//        List<Restaurant> hist = new ArrayList<Restaurant>();
//
//        given(accountRepo.findById((long) 1))
//                .willReturn(java.util.Optional.of(new Account("test@test.nl", groups, "Test", "test", favs, hist)));
//
//        //When
//        MockHttpServletResponse response = mvc.perform(
//                get("/accounts/1")
//                .accept(MediaType.APPLICATION_JSON))
//                .andReturn().getResponse();
//
//        //Then
//        assertEquals(response.getStatus(), HttpStatus.OK);
//        assertEquals(response.getContentAsString(), jsonAccount.write(new Account("test@test.nl",  groups, "Test", "test", favs, hist)));
//    }

    @Test
    void createAccount() throws Exception {
        //Given


        //When


        //Then
    }
}
