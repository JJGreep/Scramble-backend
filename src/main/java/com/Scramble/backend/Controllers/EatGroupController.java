package com.Scramble.backend.Controllers;

import com.Scramble.backend.Entities.EatGroup;
import com.Scramble.backend.Repositories.EatGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/eat_groups", produces = "application/json")
public class EatGroupController {

    @Autowired
    EatGroupRepo eatGroupRepo;

    @GetMapping(value="/all",produces = "application/json")
    public @ResponseBody
    List<EatGroup> findAll(@RequestParam Optional<String> name){
        if(name.isPresent()){
            return eatGroupRepo.findByName(name.get());
        }
        else{
            return eatGroupRepo.findAll();
        }
    }

    @GetMapping(value="/{id}", produces = "application/json")
    public @ResponseBody
    EatGroup findById(@PathVariable long id){
        return eatGroupRepo.findById(id);
    }

    @PostMapping(value="/load")
    public EatGroup load(@RequestBody final EatGroup eatgroup) {
        eatGroupRepo.save(eatgroup);
        return (EatGroup) eatGroupRepo.findByName(eatgroup.getName());
    }

}
