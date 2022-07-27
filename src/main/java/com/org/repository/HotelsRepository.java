package com.org.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.org.entiry.Hotels;

@Repository
public interface HotelsRepository extends CrudRepository<Hotels, Integer> {

	@Query("select distinct h from Hotels h")
	public List<Hotels> findDistinctHotels();

	@Query(nativeQuery = true, value = "SELECT *  FROM hotels INNER JOIN rooms ON hotels.referenced_hotel_id = rooms.referenced_hotel_id")
	public List<Hotels> findAllByInnerJoin();
}
