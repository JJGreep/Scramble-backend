package com.Scramble.backend.Services;
import com.Scramble.backend.Models.CuisineDetails;
import com.Scramble.backend.Models.CuisineList;
import com.Scramble.backend.Models.Filter;
import com.Scramble.backend.Models.Search;
import com.Scramble.backend.UriBuilder.UriBuilderWithQueries;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ZomatoService {

    private UriBuilderWithQueries uriBuilder;

    // calls the Zomato API
    RestTemplate restTemplate = new RestTemplate();

    public HttpHeaders setHeaders(){
        HttpHeaders headers = new HttpHeaders();

        // sets headers

        headers.setAccept(Collections.singletonList((MediaType.APPLICATION_JSON)));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("user-key", "a71057b41a6526cec5e3cc053ad34915" );
        return headers;
    }

    public Search CallSearchApi() throws Exception{

        // Url
        //TODO: String Builder for url to include all fields, applying filter information from front-end.

        String url = "https://developers.zomato.com/api/v2.1/search?sort=real_distance&entity_type=zone&count=10&lat=42.054026&lon=-72.557066&radius=1000&sort=real-distance&order=asc";

        HttpEntity<Search> entity = new HttpEntity<>(setHeaders());

        ResponseEntity<Search> response = restTemplate.exchange(url,HttpMethod.GET, entity, Search.class);

        HttpStatus statusCode = response.getStatusCode();
        System.out.println("Response Status Code: " + statusCode);

        // check status
        if (statusCode == HttpStatus.OK){
            System.out.println("Restaurants found: " + Objects.requireNonNull(response.getBody()).getResultsShown());

            return response.getBody();
        }
        else throw new Exception("Run into Exception: " + statusCode.toString());

    }

    public Search CallSearchApiFiltered(Filter f) throws Exception{
        String scheme = "http";
        String host = "developers.zomato.com";
        String path = "/api/v2.1/search";

        String baseUrl = "https://developers.zomato.com/api/v2.1/search";
        //String url = uriBuilder.constructUri(scheme, host, path);
        String url = baseUrl + "?lat=" + f.getLat() + "&lon=" + f.getLon() + "&radius=" + f.getRadius() + "&cuisines=" + f.getCuisines() + "&start=" + f.getStart() + "&count=" + f.getCount();
        System.out.println(url);
        // sets headers

        setHeaders().setAccept(Collections.singletonList((MediaType.APPLICATION_JSON)));
        setHeaders().setContentType(MediaType.APPLICATION_JSON);
        setHeaders().set("user-key", "a71057b41a6526cec5e3cc053ad34915" );

        HttpEntity<Search> entity = new HttpEntity<>(setHeaders());

        ResponseEntity<Search> response = restTemplate.exchange(url,HttpMethod.GET, entity, Search.class);

        HttpStatus statusCode = response.getStatusCode();
        System.out.println("Response Status Code: " + statusCode);
        System.out.println(url);

        // check status
        if (statusCode == HttpStatus.OK){
            System.out.println("Restaurants found: " + Objects.requireNonNull(response.getBody()).getResultsShown());

            return response.getBody();
        }
        else throw new Exception("Run into Exception: " + statusCode.toString());
    }

    public Search CallSearchApiPaginated(Filter f) throws Exception{
        String scheme = "https";
        String host = "developers.zomato.com";
        String path = "/api/v2.1/search";

        String url = uriBuilder.constructUri(scheme, host, path);


        // sets headers

        setHeaders().setAccept(Collections.singletonList((MediaType.APPLICATION_JSON)));
        setHeaders().setContentType(MediaType.APPLICATION_JSON);
        setHeaders().set("user-key", "a71057b41a6526cec5e3cc053ad34915" );

        HttpEntity<Search> entity = new HttpEntity<>(setHeaders());

        ResponseEntity<Search> response = restTemplate.exchange(url,HttpMethod.GET, entity, Search.class);

        HttpStatus statusCode = response.getStatusCode();
        System.out.println("Response Status Code: " + statusCode);

        // check status
        if (statusCode == HttpStatus.OK){
            System.out.println("Restaurants found: " + Objects.requireNonNull(response.getBody()).getResultsShown());

            return response.getBody();
        }
        else throw new Exception("Run into Exception: " + statusCode.toString());
    }

    public List<CuisineDetails> CallCuisinesAPI() throws Exception {

        String url = "https://developers.zomato.com/api/v2.1/cuisines?lat=42.054026&lon=-72.557066";
        
        HttpHeaders headers = new HttpHeaders();
        RestTemplate restTemplate = new RestTemplate();

        headers.setAccept(Collections.singletonList((MediaType.APPLICATION_JSON)));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("user-key", "a71057b41a6526cec5e3cc053ad34915" );

        HttpEntity<CuisineList> entity = new HttpEntity<>(headers);

        ResponseEntity<CuisineList> response = restTemplate.exchange(url, HttpMethod.GET, entity, CuisineList.class);
        HttpStatus statusCode = response.getStatusCode();
        System.out.println("Response Status Code: " + statusCode);



        if (statusCode == HttpStatus.OK){

            System.out.println("Cuisines found: "+ Objects.requireNonNull(response.getBody()).getCuisines().size());
            return response.getBody().getCuisines().stream().map(c -> c.getCuisine()).collect(Collectors.toList());
        }
        else throw new Exception("Run into Exception: " + statusCode.toString());
    }

}
