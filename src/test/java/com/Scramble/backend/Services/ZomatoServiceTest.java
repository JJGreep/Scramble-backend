package com.Scramble.backend.Services;



import com.Scramble.backend.Models.Restaurant;
import com.Scramble.backend.Models.Search;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ZomatoServiceTest {

//    @Mock
//    private RestTemplate restTemplate;
//
//    @InjectMocks
//    private ZomatoService zomatoService = new ZomatoService();



//    @Test
//    void callSearchApi() throws Exception {
//        // given

//        Search search = new Search();
//        Restaurant[] restaurants = new Restaurant[1];
//        Restaurant restaurant = new Restaurant();
//        restaurant.setId(1);
//        restaurant.setName("McDonalds");
//        restaurant.setCusines("Italian");
//        restaurant.setUrl("http://example.com");
//        restaurant.setPrice_range(30);
//        restaurants[0] = restaurant;
//        search.setResults_found(3068);
//        search.setResults_start(0);
//        search.setResults_shown(1);
//        search.setRestaurants(restaurants);
//
//        Mockito
//            .when(restTemplate.getForEntity("https://developers.zomato.com/api/v2.1/search?sort=real_distance&entity_type=zone&count=10&lat=53.022791&lon=-2.184461&radius=1000&order=asc",Search.class))
//            .thenReturn(new ResponseEntity(search, HttpStatus.OK));
//
//        Search search2 = zomatoService.CallSearchApi();
//        assertEquals(search,search2);

//    }
}
