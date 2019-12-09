package com.Scramble.backend.Services;

import com.Scramble.backend.Models.Restaurant_;
import com.Scramble.backend.Models.Search;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class SingleRestaurantService {

    public Restaurant_ SearchSingleRes(String id) throws Exception {

        String url = "https://developers.zomato.com/api/v2.1/restaurant?res_id=" + id;

        HttpHeaders headers = new HttpHeaders();
        RestTemplate restTemplate = new RestTemplate();

        // sets headers

        headers.setAccept(Collections.singletonList((MediaType.APPLICATION_JSON)));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("user-key", "a71057b41a6526cec5e3cc053ad34915" );

        HttpEntity<Restaurant_> entity = new HttpEntity<>(headers);

        ResponseEntity<Restaurant_> response = restTemplate.exchange(url, HttpMethod.GET, entity, Restaurant_.class);

        HttpStatus statusCode = response.getStatusCode();
        System.out.println("Response Status Code: " + statusCode);

        // check status
        if (statusCode == HttpStatus.OK){
            System.out.println("Result found: " + response.getBody().getName());

            return response.getBody();
        }
        else throw new Exception("Run into Exception: " + statusCode.toString());

    }

    //TODO: Way to save Restaurant in DB + relation with user in History or Favorites join-table.
}
