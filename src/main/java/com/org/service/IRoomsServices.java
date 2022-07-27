package com.org.service;

import java.util.List;
import java.util.Optional;

import com.org.dto.RoomDTO;
import com.org.entiry.Rooms;

public interface IRoomsServices {

	public boolean addRooms(RoomDTO room) throws Exception;
	
	public Optional<Rooms> getRoomById(int roomId);
	
	public List<Rooms> getAllRooms();
}
