package com.org.conrtoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dto.RoomDTO;
import com.org.entiry.Rooms;
import com.org.service.IRoomsServices;

import io.swagger.annotations.Api;

@CrossOrigin("*")
@RestController
@RequestMapping("/rooms-controller")
@Api(value = "Rooms relates operations handle by this controller")
public class RoomsController {

	@Autowired
	private IRoomsServices iRoomsServices;

	@PostMapping("/add-room")
	public ResponseEntity<String> addRoom(@RequestBody RoomDTO rooms) throws Exception {
		iRoomsServices.addRooms(rooms);
		return ResponseEntity.status(HttpStatus.OK).body("room added successfully");
	}

	@GetMapping("/get-all-rooms")
	public ResponseEntity<List<Rooms>> getAllRooms() {
		List<Rooms> rooms = iRoomsServices.getAllRooms();
		return ResponseEntity.status(HttpStatus.OK).body(rooms);
	}
	
	@GetMapping("get-room-by-id/{roomId}")
	public ResponseEntity<Optional<Rooms>> getRoomById(@PathVariable int roomId) {
		Optional<Rooms> room=iRoomsServices.getRoomById(roomId);
		return ResponseEntity.status(HttpStatus.OK).body(room);
	}
	
}
