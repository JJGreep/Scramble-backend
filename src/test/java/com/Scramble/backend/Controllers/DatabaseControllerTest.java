package com.Scramble.backend.Controllers;

import com.Scramble.backend.Entities.EatGroup;
import com.Scramble.backend.Repositories.EatGroupRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
class DatabaseControllerTest {

    private MockMvc mvc;
    private RequestBuilder requestBuilder;
    private JacksonTester<EatGroup> jsonEatGroup;

    @Mock
    private EatGroupRepo eatGroupRepo;

    @InjectMocks
    private DatabaseController databaseController;


    @Test
    void findById() throws Exception {
        //Given
        given(eatGroupRepo.findById(1))
                .willReturn(new EatGroup(1,"EtenRoffa"));

        //When
        MockHttpServletResponse response = mvc.perform(
                get("/db/1")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        //Then
        assertEquals(response.getStatus(),HttpStatus.OK);
        assertEquals(response.getContentAsString(),jsonEatGroup.write(new EatGroup(1,"EtenRoffa")));

    }

    @Test
    void findByName() throws Exception {
        //Given
        given(eatGroupRepo.findByName("EtenRoffa"))
                .willReturn(new EatGroup(1,"EtenRoffa"));

        //When
        MockHttpServletResponse response = mvc.perform(
                get("/db/EtenRoffa")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        //Then
        assertEquals(response.getStatus(),HttpStatus.OK);
        assertEquals(response.getContentAsString(),jsonEatGroup.write(new EatGroup(1,"EtenRoffa")));

    }

}
