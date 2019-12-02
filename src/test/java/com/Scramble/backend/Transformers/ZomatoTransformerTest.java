package com.Scramble.backend.Transformers;

import com.Scramble.backend.Models.Restaurant;
import com.Scramble.backend.Models.RestaurantTr;
import com.Scramble.backend.Models.Search;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZomatoTransformerTest {



    @Test
    public void basicTest(){
        //given
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        Restaurant restaurant = new Restaurant();
        restaurant.setId(1);
        restaurant.setName("McDonalds");
        restaurant.setCusines("Italian");
        restaurant.setUrl("http://example.com");
        restaurant.setPrice_range(30);
        restaurants.add(restaurant);

        ZomatoTransformer zomatoTransformer = new ZomatoTransformer();
        Search search = new Search( 1,0,1, restaurants);

        // when we transform search object

        ArrayList<RestaurantTr> result = zomatoTransformer.transform(search);

        //then we expect the data we need

        assertThat(result,hasSize(1));
        assertThat(result,hasItem(new RestaurantTr(1,"McDonalds","http://example.com","Italian",30)));
    }

}
