package com.Scramble.backend.Controllers;

import com.Scramble.backend.Entities.EatGroup;
import com.Scramble.backend.Repositories.EatGroupRepo;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GroupControllerTest {

    @Mock
    private EatGroupRepo eatGroupRepo;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();


    @Test
    void testFindById() throws Exception {
        //Given
        EatGroup group = new EatGroup(0, "Javaanse Strijders");

        //When


        //Then

    }

    @Test
    void testFindAll() throws Exception{
        //Given
        EatGroup group = new EatGroup(0, "Javaanse Strijders");

        //When


        //Then
    }

    @Test
    void testCreateGroup() throws Exception{
        //Given


        //When


        //Then
    }

    @Test
    void testUpdateGroup() throws Exception{
        //Given
        GroupController groupController = new GroupController(eatGroupRepo);
        EatGroup group = new EatGroup(0, "Javaanse Strijders");
        eatGroupRepo.save(group);
        when(eatGroupRepo.findById(0L)).thenReturn(Optional.of(group));

        //When
        groupController.updateGroup(0L, group);

        //Then
        verify(eatGroupRepo).;
    }

    @Test
    void testDeleteGroup() throws Exception{
        //Given
        GroupController groupController = new GroupController(eatGroupRepo);
        EatGroup group = new EatGroup(0, "Javaanse Strijders");
        eatGroupRepo.save(group);
        when(eatGroupRepo.findById(0L)).thenReturn(Optional.of(group));

        //When
        groupController.deleteGroup(0L);

        //Then
        verify(eatGroupRepo).delete(group);
    }

}
