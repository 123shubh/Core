package com.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.entiry.ReservationEntity;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Integer>{
	
	/*
	 * public String findByHotelId(String hotelId);
	 * 
	 * public String findByRoomId(String roomId);
	 * 
	 * public String findRatePlanId(String ratePlanId);
	 */
	
	

}
