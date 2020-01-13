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

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EatGroupControllerTest {

    @Mock
    private EatGroupRepo eatGroupRepo;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();


    @Test
    void testFindById() throws Exception {
        //Given
        EatGroupController eatGroupController = new EatGroupController(eatGroupRepo);
        EatGroup group = new EatGroup(0, "Javaanse Strijders");
        when(eatGroupRepo.findById(0L)).thenReturn(Optional.of(group));

        //When
        eatGroupController.findById(0L);

        //Then
        verify(eatGroupRepo).findById(0L);
    }

    @Test
    void testFindAll() throws Exception{
        //Given
        EatGroupController eatGroupController = new EatGroupController(eatGroupRepo);
        List<EatGroup> groupList = new ArrayList<EatGroup>();
        EatGroup group1 = new EatGroup(0, "Javaanse Strijders");
        EatGroup group2 = new EatGroup(1, "PokoLoco");
        groupList.add(group1);
        groupList.add(group2);
        //when(eatGroupRepo.findByName("PokoLoco")).thenReturn(groupList);
        when(eatGroupRepo.findAll()).thenReturn(groupList);

        //When
        eatGroupController.findAll("");

        //Then
        verify(eatGroupRepo).findAll();
    }

    @Test
    void testCreateGroup() throws Exception{
        //Given
        EatGroupController eatGroupController = new EatGroupController(eatGroupRepo);
        EatGroup newEatGroup = new EatGroup(0L, "Javaanse Strijders");

        when(eatGroupRepo.save(newEatGroup)).thenReturn(newEatGroup);
        //When

        EatGroup eatGroup = eatGroupController.createGroup(newEatGroup);

        //Then
        verify(eatGroupRepo).save(eatGroup);
        assertThat(eatGroup,is(equalTo(newEatGroup)));
    }

    @Test
    void testUpdateGroup() throws Exception{
        //Given
        EatGroupController eatGroupController = new EatGroupController(eatGroupRepo);
        EatGroup eatGroup = new EatGroup(0, "Javaanse Strijders");
        when(eatGroupRepo.findById(0L)).thenReturn(Optional.of(eatGroup));

        //When
        eatGroupController.updateGroup(0L, eatGroup);

        //Then
        verify(eatGroupRepo).save(eatGroup);
    }

    @Test
    void testDeleteGroup() throws Exception{
        //Given
        EatGroupController eatGroupController = new EatGroupController(eatGroupRepo);
        EatGroup group = new EatGroup(0, "Javaanse Strijders");
        when(eatGroupRepo.findById(0L)).thenReturn(Optional.of(group));

        //When
        eatGroupController.deleteGroup(0L);

        //Then
        verify(eatGroupRepo).delete(group);
    }

}
