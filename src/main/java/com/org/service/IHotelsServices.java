package com.org.service;

import java.util.List;
import java.util.Optional;

import com.org.dto.HotelsDTO;
import com.org.entiry.Hotels;

public interface IHotelsServices {
	
	public boolean addHotel(HotelsDTO hotel) throws Exception;
	
	public List<Hotels> getAllHotels();
	
	public Optional<Hotels> getHotelById(int hotelId) throws Exception;

	public List<Hotels> getAllDistinctHotels();
}
