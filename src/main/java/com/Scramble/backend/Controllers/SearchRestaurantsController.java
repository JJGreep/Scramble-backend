package com.Scramble.backend.Controllers;


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
@RequestMapping(value = "/res", produces = "application/json")
public class SearchRestaurantsController {

    @Autowired
    private ZomatoService zomatoService;

    @Autowired
    private SingleRestaurantService singleRestaurantService;

    @Autowired
    private ZomatoTransformer zomatoTransformer;

    @GetMapping
    @ResponseBody
    public Search findAll() throws Exception {
        return zomatoService.CallSearchApi();
    }

    @GetMapping(value="/id", produces = "application/json")
    @ResponseBody
    public Restaurant_ findById(@RequestParam String id) throws Exception {
        return singleRestaurantService.SearchSingleRes(id);
    }



}
