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

@RestController
@RequestMapping(value = "/eat_groups", produces = "application/json")
public class GroupController {

    final
    EatGroupRepo eatGroupRepo;

    public GroupController(EatGroupRepo eatGroupRepo) {
        this.eatGroupRepo = eatGroupRepo;
    }

    @RequestMapping(produces = "application/json", method = GET)
    public @ResponseBody
    List<EatGroup> findAll(@RequestParam String name){
        if(name != null && name != ""){
            return eatGroupRepo.findByName(name);
        }
        else{
            return eatGroupRepo.findAll();
        }
    }

    @RequestMapping(value="/{id}", produces = "application/json", method = GET)
    public @ResponseBody EatGroup findById(@PathVariable long id){

        return eatGroupRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Group not found on :: " + id));
    }

    /**
     * Create group group.
     *
     * @param group the group
     * @return the group
     */
    @RequestMapping(method = POST)
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
    @RequestMapping(value = "/{id}", method = PUT)
    public ResponseEntity<EatGroup> updateGroup(
            @PathVariable(value = "id") Long id, @Valid @RequestBody EatGroup groupDetails){
        EatGroup group =
                eatGroupRepo
                        .findById(id)
                        .orElseThrow(() -> new RuntimeException("Group not found on :: " + id));
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
    @RequestMapping(value = "/{id}", method = DELETE)
    public @ResponseBody void deleteGroup(@PathVariable(value = "id") Long id) {
        EatGroup group =
                eatGroupRepo
                    .findById(id)
                    .orElseThrow(() -> new RuntimeException("Group not found on :: " + id));
        eatGroupRepo.delete(group);
    }

}
