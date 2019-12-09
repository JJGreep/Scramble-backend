package com.Scramble.backend.Transformers;

import com.Scramble.backend.Models.Restaurant;
import com.Scramble.backend.Models.RestaurantTr;
import com.Scramble.backend.Models.Search;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ZomatoTransformer {

    // transforms API result to frontend request
//
//    public ArrayList<RestaurantTr> transform(Search searchResults){
//        ArrayList<RestaurantTr> transformedRes = new ArrayList<>();
//        List<Restaurant> restaurants = searchResults.getRestaurants();
//        int i;
//
//        for (i = 0; i < restaurants.size(); i++ ) {
//            RestaurantTr r = new RestaurantTr();
//            r.setId(restaurants.get(i).getRestaurant().getId());
//            r.setName(restaurants.get(i).getRestaurant().getName());
//            r.setUrl(restaurants.get(i).getRestaurant().getUrl());
//            r.setCuisines(restaurants.get(i).getRestaurant().getCuisines());
//            r.setPrice_range(restaurants.get(i).getRestaurant().getPriceRange());
//            transformedRes.add(r);
//        }
//        return transformedRes;
}





