package com.Scramble.backend.Services;
<<<<<<< Updated upstream
=======
import com.Scramble.backend.Models.Cuisine;
import com.Scramble.backend.Models.CuisineDetails;
import com.Scramble.backend.Models.CuisineList;
>>>>>>> Stashed changes
import com.Scramble.backend.Models.Search;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ZomatoService {

    // calls the Zomato API

    public Search CallSearchApi() throws Exception{

        // Url
        //TODO: String Builder for url to include all fields, applying filter information from front-end.

        String url = "https://developers.zomato.com/api/v2.1/search?sort=real_distance&entity_type=zone&count=10&lat=42.054026&lon=-72.557066&radius=1000&order=asc";

        HttpHeaders headers = new HttpHeaders();
        RestTemplate restTemplate = new RestTemplate();

        // sets headers

        headers.setAccept(Collections.singletonList((MediaType.APPLICATION_JSON)));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("user-key", "a71057b41a6526cec5e3cc053ad34915" );

        HttpEntity<Search> entity = new HttpEntity<>(headers);

        ResponseEntity<Search> response = restTemplate.exchange(url,HttpMethod.GET, entity, Search.class);

        HttpStatus statusCode = response.getStatusCode();
        System.out.println("Response Status Code: " + statusCode);

        // check status
        if (statusCode == HttpStatus.OK){
            System.out.println("Results found: " + Objects.requireNonNull(response.getBody()).getResultsShown());

            return response.getBody();
        }
        else throw new Exception("Run into Execption: " + statusCode.toString());

    }

<<<<<<< Updated upstream
=======
    public List<CuisineDetails> GetAllCuisines() {

        String url = "https://developers.zomato.com/api/v2.1/cuisines?lat=29.054026&lon=-22.557066";

        HttpHeaders headers = new HttpHeaders();
        RestTemplate restTemplate = new RestTemplate();

        headers.setAccept(Collections.singletonList((MediaType.APPLICATION_JSON)));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("user-key", "a71057b41a6526cec5e3cc053ad34915" );

        HttpEntity<CuisineList> entity = new HttpEntity<>(headers);

        ResponseEntity<CuisineList> response = restTemplate.exchange(url, HttpMethod.GET, entity, CuisineList.class);

        return response.getBody().getCuisines().stream().map(c -> c.getCuisine()).collect(Collectors.toList());
    }

>>>>>>> Stashed changes



}
