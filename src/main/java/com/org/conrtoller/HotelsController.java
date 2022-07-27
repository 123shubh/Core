package com.org.conrtoller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.org.dto.HotelsDTO;
import com.org.entiry.Hotels;
import com.org.repository.HotelsRepository;
import com.org.service.IHotelsServices;
import io.swagger.annotations.Api;

@CrossOrigin("*")
@RestController
@RequestMapping("/hotels-controller")
@Api(value = "Opeartions related to rates perform via this controller")
public class HotelsController {

	@Autowired
	private IHotelsServices iHotelsServices;

	@Autowired
	private HotelsRepository hotelsRepository; 
	
	private static final Logger logger = LoggerFactory.getLogger(HotelsController.class);

	@PostMapping("/add-hotel")
	public ResponseEntity<String> addHotel(HotelsDTO hotels) throws Exception {
		try {
			iHotelsServices.addHotel(hotels);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.OK).body("Hotel Added Successfully" + hotels);
	}

	@GetMapping("/get-all-hotels")
	public ResponseEntity<Object> getAllHotels() {
		return ResponseEntity.status(HttpStatus.OK).body(iHotelsServices.getAllHotels());
	}

	@GetMapping("/get-hotel-by-id/{hotelId}")
	public ResponseEntity<Optional<Hotels>> getHotelById(@PathVariable int hotelId) throws Exception {
		logger.info("hotelId : {}", hotelId);
		Optional<Hotels> hotel = iHotelsServices.getHotelById(hotelId);
		return ResponseEntity.status(HttpStatus.OK).body(hotel);
	}

	@GetMapping("get-all-distinct-hotels")
	public ResponseEntity<List<Hotels>> getAllDistinctHotels() {
		return ResponseEntity.status(HttpStatus.OK).body(iHotelsServices.getAllDistinctHotels());
	}

	@GetMapping("get-all-inner-join")
	public ResponseEntity<Object> getAllHotelsInnerJoion() {
		Object object=hotelsRepository.findAllByInnerJoin().stream().findAny().get().getRooms();
		return ResponseEntity.status(HttpStatus.OK).body(object);
	}
}
