package com.org.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dto.HotelsDTO;
import com.org.entiry.Hotels;
import com.org.repository.HotelsRepository;

import javassist.NotFoundException;

@Service
public class HotelsServices implements IHotelsServices {

	public static Logger logger = LoggerFactory.getLogger(IHotelsServices.class);

	@Autowired
	private HotelsRepository hotelsRepository;

	@Override
	public boolean addHotel(HotelsDTO hotel) throws Exception {
		try {
			Hotels newHotel = new Hotels(hotel.getHotelId(), hotel.getHotelName(), hotel.getHotelCity(),
					hotel.getHotelAddress(), hotel.getReferencedHotelId(), hotel.getTotalNumberOfRooms(),
					hotel.getNumberOfAvailableRooms());
			hotelsRepository.save(newHotel);
			return true;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<Hotels> getAllHotels() {
		return (List<Hotels>) hotelsRepository.findAll();

	}

	@Override
	public Optional<Hotels> getHotelById(int hotelId) throws Exception {
		Optional<Hotels> hotel = hotelsRepository.findById(hotelId);
		if (hotel.isPresent()) {
			return hotel;
		} else {
			throw new NotFoundException("Hotel not found");
		}
	}
	
	public List<Hotels> getAllDistinctHotels(){
		return hotelsRepository.findDistinctHotels();
	}

}
