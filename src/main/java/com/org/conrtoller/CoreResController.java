package com.org.conrtoller;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.entiry.ReservationEntity;
import com.org.exception.ReservationAlreadyExist;
import com.org.service.IReservationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * reservation controller
 * 
 * @author deshm
 *
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/reservations")
@Api(value = "Core controller JSON reservations")
public class CoreResController {

	@Autowired
	private IReservationService iReservationService;

	static final Logger logger = LoggerFactory.getLogger(CoreResController.class);

	/**
	 * used to post data to DB
	 * 
	 * @param requestReservation
	 * @return
	 * @throws NotFoundException
	 * @throws ReservationAlreadyExist
	 */
	@ApiOperation(value = "posting reservation to DB")
	@PostMapping("/post-reservation")
	public ResponseEntity<String> postReservations(@RequestBody ReservationEntity requestReservation)
			throws ReservationAlreadyExist {
		logger.info("Input Request reciived : {} ", requestReservation);

		String hotelId = requestReservation.getHotelId();
		int reservationId = requestReservation.getReservationId();
		LocalDate startDateOfReservation = requestReservation.getStartDateOfReservation();
		LocalDate endDateOfReservation = requestReservation.getEndDateOfReservation();
		String ratePlanId = requestReservation.getRatePlanId();
		String roomId = requestReservation.getRoomId();

		iReservationService.checkIfHotelPresent(hotelId);
		iReservationService.checkIfRoomIdPresent(roomId, ratePlanId);
		iReservationService.checkIfRatePlanPresent(hotelId, ratePlanId);
		iReservationService.checkIfStartDateAndDateAreValid(startDateOfReservation, endDateOfReservation);
		iReservationService.checkForDuplicateReservation(reservationId);

		iReservationService.postReservation(requestReservation);

		return ResponseEntity.status(HttpStatus.OK).body("res suceess");
	}

}
