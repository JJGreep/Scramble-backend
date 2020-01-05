package com.Scramble.backend.Repositories;

import com.Scramble.backend.Entities.EatGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@Repository
public
interface EatGroupRepo extends CrudRepository<EatGroup, Long> {

    List<EatGroup> findByName(String name);
    List<EatGroup> findAll();
    EatGroup findById(long id);

}
