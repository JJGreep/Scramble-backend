package com.Scramble.backend.Controllers;


import com.Scramble.backend.Models.RestaurantTr;
import com.Scramble.backend.Services.ZomatoService;
import com.Scramble.backend.Transformers.ZomatoTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

// API endpoints for frontend

@RestController
@RequestMapping(value = "/res", produces = "application/json")
public class ZomatoController {

    @Autowired
    private ZomatoService zomatoService;

    @Autowired
    private ZomatoTransformer zomatoTransformer;

    @GetMapping
    @ResponseBody
    public ArrayList<RestaurantTr> findAll() throws Exception {
        return zomatoTransformer.transform(zomatoService.CallSearchApi());
    }


}
