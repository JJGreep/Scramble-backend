package com.Scramble.backend.Controllers;


import com.Scramble.backend.Models.Filter;
import com.Scramble.backend.Models.RestaurantTr;
import com.Scramble.backend.Models.Restaurant_;
import com.Scramble.backend.Models.Search;
import com.Scramble.backend.Services.SingleRestaurantService;
import com.Scramble.backend.Services.ZomatoService;
import com.Scramble.backend.Transformers.ZomatoTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

// API endpoints for frontend

@RestController
@CrossOrigin()
@RequestMapping(value = "/res", produces = "application/json")
public class SearchRestaurantsController {

    @Autowired
    private ZomatoService zomatoService;

    @Autowired
    private SingleRestaurantService singleRestaurantService;

    @Autowired
    private ZomatoTransformer zomatoTransformer;

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<RestaurantTr> findAll() throws Exception {
        return zomatoTransformer.Transform(zomatoService.CallSearchApi());
    }

    @GetMapping(value="/id", produces = "application/json")
    @ResponseBody
    public Restaurant_ findById(@RequestParam String id) throws Exception {
        return singleRestaurantService.SearchSingleRes(id);
    }

    @PostMapping(value="/pagination/{start}/{count}/{lat}/{lon}/{radius}/{cuisines}")
    @ResponseBody
    public List<RestaurantTr> findPaginated(@PathVariable Integer start, @PathVariable Integer count,
                                            @PathVariable Double lat, @PathVariable Double lon,
                                            @PathVariable Integer radius, @PathVariable String cuisines) throws Exception {
        Filter f = new Filter();
        f.setStart(start);
        f.setCount(count);
        f.setLat(lat);
        f.setLon(lon);
        f.setRadius(radius);
        f.setCuisines(cuisines);
        return zomatoTransformer.Transform(zomatoService.CallSearchApiPaginated(f));
    }
    //TODO: A way to use filter information to apply to Services (Probably in header)

    @PostMapping(value="/filter/{lat}/{lon}/{radius}/{cuisines}")
    @ResponseBody
    public List<RestaurantTr> findFiltered(@PathVariable Double lat, @PathVariable Double lon,
                                           @PathVariable Integer radius, @PathVariable String cuisines) throws Exception {
        Filter f = new Filter();
        f.setStart(0);
        f.setCount(10);
        f.setLat(lat);
        f.setLon(lon);
        f.setRadius(radius);
        f.setCuisines(cuisines);
        return zomatoTransformer.Transform(zomatoService.CallSearchApiFiltered(f));
    }


}
