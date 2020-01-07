package com.Scramble.backend.Controllers;


import com.Scramble.backend.Entities.EatGroup;
import com.Scramble.backend.Repositories.EatGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.springframework.web.bind.annotation.RequestMethod.*;

//@RestController
//@RequestMapping(value = "/eat_groups", produces = "application/json")
//public class GroupController {

//    final
//    EatGroupRepo eatGroupRepo;
//

//    @RequestMapping(produces = "application/json", method = GET)
//    public @ResponseBody
//    List<EatGroup> findAll(@RequestParam String name){
//        if(name != null && !name.isEmpty()){
//            return eatGroupRepo.findByName(name);
//        }
//        else{
//            return eatGroupRepo.findAll();
//        }
//    }
//
//    @RequestMapping(value="/{id}", produces = "application/json", method = GET)
//    public @ResponseBody EatGroup findById(@PathVariable long id){
//
//        return eatGroupRepo.findById(id)
//                .orElseThrow(() -> new RuntimeException("Group not found on: " + id));
//    }


//}
