package com.Scramble.backend.Controllers;


import com.Scramble.backend.Entities.EatGroup;
import com.Scramble.backend.Repositories.EatGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/db", produces = "application/json")
public class DatabaseController {

    @Autowired
    EatGroupRepo eatGroupRepo;

    @GetMapping(produces = "application/json")
    public @ResponseBody
    List<EatGroup> findAll(){
        return eatGroupRepo.findAll();
    }

    @GetMapping(value="/name", produces = "application/json")
    public @ResponseBody EatGroup findByName(@PathVariable String name){
        return eatGroupRepo.findByName(name);
    }

    @GetMapping(value="/id", produces = "application/json")
    public @ResponseBody EatGroup findById(@PathVariable long id){
        return eatGroupRepo.findById(id);
    }

}
