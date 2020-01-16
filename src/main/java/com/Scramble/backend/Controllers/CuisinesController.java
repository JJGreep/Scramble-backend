package com.Scramble.backend.Controllers;

import com.Scramble.backend.Models.Cuisine;
import com.Scramble.backend.Services.ZomatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
@RequestMapping(value = "/cuisines", produces = "application/json")
public class CuisinesController {

    @Autowired
    private ZomatoService zomatoService;

    public CuisinesController(ZomatoService zomatoService)
    {
        this.zomatoService = zomatoService;
    }
    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<Cuisine> getAllCuisines() {
        return zomatoService.GetAllCuisines();
    }
}
