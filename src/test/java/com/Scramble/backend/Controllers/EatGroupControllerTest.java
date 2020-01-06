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

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GroupControllerTest {

    @Mock
    private EatGroupRepo eatGroupRepo;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();


//    @Test
//    void testFindById() throws Exception {
//        //Given
//        GroupController groupController = new GroupController(eatGroupRepo);
//        EatGroup group = new EatGroup(0, "Javaanse Strijders");
//        when(eatGroupRepo.findById(0L)).thenReturn(Optional.of(group));
//
//        //When
//        groupController.findById(0L);
//
//        //Then
//        verify(eatGroupRepo).findById(0L);
//    }
//
//    @Test
//    void testFindAll() throws Exception{
//        //Given
//        GroupController groupController = new GroupController(eatGroupRepo);
//        List<EatGroup> groupList = new ArrayList<EatGroup>();
//        EatGroup group1 = new EatGroup(0, "Javaanse Strijders");
//        EatGroup group2 = new EatGroup(1, "PokoLoco");
//        groupList.add(group1);
//        groupList.add(group2);
//        //when(eatGroupRepo.findByName("PokoLoco")).thenReturn(groupList);
//        when(eatGroupRepo.findAll()).thenReturn(groupList);
//
//        //When
//        groupController.findAll("");
//
//        //Then
//        verify(eatGroupRepo).findAll();
//    }
//
//    //TODO:Test not correct
////    @Test
////    void testCreateGroup() throws Exception{
////        //Given
////        GroupController groupController = new GroupController(eatGroupRepo);
////
////        //When
////        EatGroup group = groupController.createGroup(new EatGroup(0L, "Javaanse Strijders"));
////
////        //Then
////        verify(eatGroupRepo).save(group);
////    }
//
//    @Test
//    void testUpdateGroup() throws Exception{
//        //Given
//        GroupController groupController = new GroupController(eatGroupRepo);
//        EatGroup group = new EatGroup(0, "Javaanse Strijders");
//        when(eatGroupRepo.findById(0L)).thenReturn(Optional.of(group));
//
//        //When
//        groupController.updateGroup(0L, group);
//
//        //Then
//        verify(eatGroupRepo).save(group);
//    }
//
//    @Test
//    void testDeleteGroup() throws Exception{
//        //Given
//        GroupController groupController = new GroupController(eatGroupRepo);
//        EatGroup group = new EatGroup(0, "Javaanse Strijders");
//        when(eatGroupRepo.findById(0L)).thenReturn(Optional.of(group));
//
//        //When
//        groupController.deleteGroup(0L);
//
//        //Then
//        verify(eatGroupRepo).delete(group);
//    }

}
