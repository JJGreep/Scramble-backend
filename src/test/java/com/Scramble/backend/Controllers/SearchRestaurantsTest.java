package com.Scramble.backend.Controllers;

import com.Scramble.backend.Entities.RestaurantDb;
import com.Scramble.backend.Models.Restaurant_;
import com.Scramble.backend.Models.Search;
import com.Scramble.backend.Services.SingleRestaurantService;
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
public class SearchRestaurantsTest {
    @Mock
    private SingleRestaurantService singleRestaurantService;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    void testFindAll() throws Exception{
        SearchRestaurantsController searchRestaurantsController = new SearchRestaurantsController(singleRestaurantService);
        List<Search> searchList = new ArrayList<Search>();
        List<Restaurant_> restaurants = new ArrayList<Restaurant_>();
        Search search1 = new Search(1, 1, 2, restaurants);
        Search search2 = new Search(2,4,6, restaurants);
        searchList.add(search1);
        searchList.add(search2);

        when(singleRestaurantService.SearchSingleRes("")).thenReturn();
        //when(singleRestaurantService.SearchSingleRes("1")).thenReturn((Restaurant_) searchList);

        searchRestaurantsController.findAll();

        verify(singleRestaurantService).SearchSingleRes("1");


    }
}
