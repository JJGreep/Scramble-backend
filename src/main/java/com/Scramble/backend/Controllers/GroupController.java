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

@Controller
@RequestMapping(value = "/eat_groups", produces = "application/json")
public class GroupController {

    @Autowired
    EatGroupRepo eatGroupRepo;

    @GetMapping(produces = "application/json")
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
    public @ResponseBody EatGroup findById(@PathVariable long id){

        return eatGroupRepo.findById(id);
    }

    /**
     * Create group group.
     *
     * @param group the group
     * @return the group
     */
    @PostMapping("/accounts")
    public EatGroup createGroup(@Valid @RequestBody EatGroup group) {
        return eatGroupRepo.save(group);
    }

    /**
     * Update group response entity.
     *
     * @param id the user id
     * @param groupDetails the group details
     * @return the response entity
     * @throws RuntimeException the resource not found exception
     */
    @PutMapping("/accounts/{id}")
    public ResponseEntity<EatGroup> updateGroup(
            @PathVariable(value = "id") Long id, @Valid @RequestBody EatGroup groupDetails){
        EatGroup group =
                eatGroupRepo
                        .findById(id)
                        .orElseThrow(() -> new RuntimeException("User not found on :: " + id));
        group.setName(group.getName());
        group.setAccounts(group.getAccounts());
        final EatGroup updatedGroup = eatGroupRepo.save(group);
        return ResponseEntity.ok(updatedGroup);
    }

    /**
     * Delete group map.
     *
     * @param id the group id
     * @return the map
     * @throws RuntimeException the exception
     */
    @DeleteMapping("/accounts/{id}")
    public Map<String, Boolean> deleteGroup(@PathVariable(value = "id") Long id) {
        EatGroup group =
                eatGroupRepo
                    .findById(id)
                    .orElseThrow(() -> new RuntimeException("User not found on :: " + id));
        eatGroupRepo.delete(group);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
