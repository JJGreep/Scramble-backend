package com.Scramble.backend.Transformers;

import com.Scramble.backend.Models.Restaurant;
import com.Scramble.backend.Models.Restaurant_;
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
    public void TransformTest(){
        //given
        List<Restaurant> restaurants = new ArrayList<>();
        Restaurant restaurant = new Restaurant();

        Restaurant_ restaurant_ = new Restaurant_();
        restaurant_.setId("1");
        restaurant_.setName("McDonalds");
        restaurant_.setCuisines("Italian");
        restaurant_.setUrl("http://example.com");
        restaurant_.setPriceRange(30);
        restaurant.setRestaurant(restaurant_);
        restaurants.add(restaurant);

        ZomatoTransformer zomatoTransformer = new ZomatoTransformer();
        Search search = new Search(1, 0,1, restaurants);


        // when we transform search object

        List<RestaurantTr> result = zomatoTransformer.Transform(search);

        //then we expect the data we need

        assertThat(result,hasSize(1));
        //assertThat(result,hasItem(new RestaurantTr("1","McDonalds","http://example.com","Italian",30)));
    }

}
