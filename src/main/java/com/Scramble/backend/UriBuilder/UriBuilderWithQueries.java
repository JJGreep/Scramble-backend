package com.Scramble.backend.UriBuilder;

import com.Scramble.backend.Models.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class UriBuilderWithQueries {

    @Autowired
    private Filter filter;

    public String constructUri(String scheme, String host, String path) {
        UriComponents uriComponents = UriComponentsBuilder.newInstance()
                .scheme(scheme)
                .host(host)
                .path(path)
                .query("sort=real_distance&entity_type=zone&order=asc&lat={lat}&lon={lon}&start={start}&count={count}&cuisines={cuisines}&radius={radius}")
                .buildAndExpand(filter.getLat(), filter.getLon(), filter.getStart(), filter.getCount(), filter.getCuisines(), filter.getRadius());

        return uriComponents.toUriString();
    }
}
