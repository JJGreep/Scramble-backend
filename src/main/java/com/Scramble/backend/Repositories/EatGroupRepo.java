package com.Scramble.backend.Repositories;

import com.Scramble.backend.Entities.EatGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface EatGroupRepo extends CrudRepository<EatGroup, Long> {

    List<EatGroup> findByName(String name);
    List<EatGroup> findAll();
    EatGroup findById(long id);

}
