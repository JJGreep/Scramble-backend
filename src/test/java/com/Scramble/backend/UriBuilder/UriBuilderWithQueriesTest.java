package com.Scramble.backend.UriBuilder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UriBuilderWithQueriesTest {

    @Test
    public void constructUriTest() {

        Double lat = 0.000000;
        Double lon = 0.000000;
        Integer start = 0;
        Integer count = 10;
        String cuisines = "";
        Integer radius = 1000;

        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("developers.zomato.com")
                .path("/api/v2.1/search")
                .query("sort=real_distance&entity_type=zone&order=asc&lat={lat}&lon={lon}&start={start}&count={count}&cuisines={cuisines}&radius={radius}")
                .buildAndExpand(lat, lon, start, count, cuisines, radius);

        assertEquals("http://developers.zomato.com/api/v2.1/search?sort=real_distance&entity_type=zone&order=asc&lat=0.0&lon=0.0&start=0&count=10&cuisines=&radius=1000", uriComponents.toUriString());
    }
}
