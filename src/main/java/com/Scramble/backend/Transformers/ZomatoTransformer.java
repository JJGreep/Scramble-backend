package com.Scramble.backend.Transformers;

import com.Scramble.backend.Models.Restaurant;
import com.Scramble.backend.Models.RestaurantTr;
import com.Scramble.backend.Models.Search;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ZomatoTransformer {

    public ArrayList<RestaurantTr> transform(Search searchResults){
        ArrayList<RestaurantTr> transformedRes = new ArrayList<>();
        ArrayList<Restaurant> restaurants = searchResults.getRestaurants();
        int i;
        for (i = 0; i < restaurants.size(); i++ ) {
            RestaurantTr r = new RestaurantTr();
            r.setId(restaurants.get(i).getId());
            r.setName(restaurants.get(i).getName());
            r.setUrl(restaurants.get(i).getUrl());
            r.setCuisines(restaurants.get(i).getCusines());
            r.setPrice_range(restaurants.get(i).getPrice_range());
            transformedRes.add(r);
        }
        return transformedRes;
    }




}
