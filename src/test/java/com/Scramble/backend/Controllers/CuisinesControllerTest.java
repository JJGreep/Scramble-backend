package com.Scramble.backend.Controllers;

import com.Scramble.backend.Models.Cuisine;
import com.Scramble.backend.Models.CuisineDetails;
import com.Scramble.backend.Services.ZomatoService;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CuisinesControllerTest {

    @Mock
    private ZomatoService zomatoService;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    void getAllCuisinesTest() throws Exception{
        //Given
        CuisinesController cuisinesController = new CuisinesController(zomatoService);
        List<CuisineDetails> cuisineList = new ArrayList<CuisineDetails>();
        CuisineDetails cuisine1 = new CuisineDetails("25","Vega");
        CuisineDetails cuisine2 = new CuisineDetails("2", "Chinese");
        cuisineList.add(cuisine1);
        cuisineList.add(cuisine2);
        when(zomatoService.CallCuisinesAPI()).thenReturn(cuisineList);

        //When
        cuisinesController.getAllCuisines();

        //Then
        verify(zomatoService).CallCuisinesAPI();
    }
}
