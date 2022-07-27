package com.org.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.entiry.Rooms;

@Repository
public interface RoomsRepository extends CrudRepository<Rooms, Integer>{

}
