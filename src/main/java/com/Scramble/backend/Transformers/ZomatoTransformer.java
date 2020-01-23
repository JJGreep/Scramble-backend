package com.Scramble.backend.Transformers;

import com.Scramble.backend.Models.Restaurant;
import com.Scramble.backend.Models.RestaurantTr;
import com.Scramble.backend.Models.Restaurant_;
import com.Scramble.backend.Models.Search;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ZomatoTransformer {

    // transforms API result to frontend request

    public List<RestaurantTr> Transform(Search searchResults){
        List<RestaurantTr> transformedRes = new ArrayList<>();
        List<Restaurant> restaurants = searchResults.getRestaurants();
        List<Restaurant_> restaurants_ = new ArrayList<>();

        int i;
        for(i = 0; i< restaurants.size(); i++){
            restaurants_.add(restaurants.get(i).getRestaurant());
        }

        int j;
        for (j = 0; j < restaurants_.size(); j++ ) {
            RestaurantTr r = new RestaurantTr();
            r.setId(restaurants_.get(j).getId());
            r.setName(restaurants_.get(j).getName());
            r.setUrl(restaurants_.get(j).getUrl());
            r.setCuisines(restaurants_.get(j).getCuisines());
            r.setAverage_cost_for_two(restaurants_.get(j).getAverageCostForTwo());
            r.setPhoto_url(restaurants_.get(j).getFeaturedImage());
            transformedRes.add(r);
        }
        return transformedRes;
    }
}





