package com.org.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dto.RoomDTO;
import com.org.entiry.Hotels;
import com.org.entiry.Rooms;
import com.org.repository.RoomsRepository;

import javassist.NotFoundException;

@Service
public class RoomsServices implements IRoomsServices {

	private static final Logger logger = LoggerFactory.getLogger(RoomsServices.class);

	@Autowired
	private RoomsRepository roomsRepository;

	@Autowired
	private IHotelsServices hotelsServices;

	@Override
	public boolean addRooms(RoomDTO room) throws Exception {
		Optional<Hotels> hotel = hotelsServices.getHotelById(room.getReferenceHotelId());
		if (hotel.isPresent()) {
			Hotels newHotel = hotel.get();
			Rooms newRoom = new Rooms(room.getRoomId(), room.getRoomName(), room.getRoomDetails(), newHotel,
					room.isRoomAvailable(),room.getReferencedRoomId());
			return (roomsRepository.save(newRoom) != null) ? true : false;
		} else {
			throw new NotFoundException("Hotel did found for hioven HotelId : " + room.getReferenceHotelId());
		}

	}

	@Override
	public Optional<Rooms> getRoomById(int roomId) {
		return roomsRepository.findById(roomId);
	}

	@Override
	public List<Rooms> getAllRooms() {
		return (List<Rooms>) roomsRepository.findAll();
	}

}
