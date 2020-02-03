package com.Scramble.backend.Controllers;

import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Entities.EatGroup;
import com.Scramble.backend.Models.CreateEatGroup;
import com.Scramble.backend.Repositories.EatGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping(value = "/eat_groups", produces = "application/json")
public class EatGroupController {

    @Autowired
    EatGroupRepo eatGroupRepo;

    public EatGroupController(EatGroupRepo eatGroupRepo) {
        this.eatGroupRepo = eatGroupRepo;
    }

    @GetMapping(value="/all",produces = "application/json")
    public @ResponseBody
    List<EatGroup> findAll(@RequestParam String name){
        if(name != null && !name.isEmpty()){
            return eatGroupRepo.findByName(name);
        }
        else{
            return eatGroupRepo.findAll();
        }
    }

    @GetMapping(value="/{id}", produces = "application/json")
    public @ResponseBody
    EatGroup findById(@PathVariable long id) throws Exception {
        Optional<EatGroup> optEatGroup = eatGroupRepo.findById(id);
       if( optEatGroup.isPresent()){
           return optEatGroup.get();
       }
       else throw new Exception("No item found with that Id!");
    }

    /**
     *
     * @param createEatGroup
     * @return
     */
    @PostMapping(value="/createGroup", consumes = "application/json", produces = "application/json")
    public ResponseEntity<EatGroup> createGroup(@RequestBody final CreateEatGroup createEatGroup) {
        EatGroup eatgroup = new EatGroup();
        List<Account> accounts = createEatGroup.getAccounts();
        eatgroup.setAccounts(accounts);
        eatgroup.setName(createEatGroup.getName());
        EatGroup returnedEatGroup = eatGroupRepo.save(eatgroup);
        System.out.println(returnedEatGroup);
        return ResponseEntity.ok(returnedEatGroup);
    }

    /**
     * Update group response entity.
     *
     * @param id the user id
     * @param groupDetails the group details
     * @return the response entity
     * @throws RuntimeException the resource not found exception
     */
    @PutMapping(value= "/updateGroup/{id}", consumes = "application/json", produces = "application/json")
    public ResponseEntity<EatGroup> updateGroup(
            @PathVariable(value = "id") Long id,
            @Valid
            @RequestBody final EatGroup groupDetails){
        EatGroup group =
                eatGroupRepo
                        .findById(id)
                        .orElseThrow(() -> new RuntimeException("Group not found on: " + id));
        group.setName(groupDetails.getName());
        group.setAccounts(groupDetails.getAccounts());
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

    @DeleteMapping(value="/deleteGroup/{id}")
    public @ResponseBody void deleteGroup(@PathVariable(value = "id") Long id) {

        EatGroup group =
                eatGroupRepo
                        .findById(id)
                        .orElseThrow(() -> new RuntimeException("Group not found on :: " + id));

        //Delete Eatgroup
        eatGroupRepo.delete(group);
    }




}
