package com.Scramble.backend.Controllers;

import com.Scramble.backend.Models.CuisineDetails;
import com.Scramble.backend.Services.ZomatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
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
    List<CuisineDetails> getAllCuisines() throws Exception {
        return zomatoService.CallCuisinesAPI();
    }
}
