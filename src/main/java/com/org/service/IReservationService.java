package com.org.service;

import java.time.LocalDate;

import com.org.entiry.ReservationEntity;
import com.org.exception.ReservationAlreadyExist;

public interface IReservationService {
	
	public boolean checkIfHotelPresent(String hotelId);

	public boolean checkIfRoomIdPresent(String roomId, String ratePlanId);

	public boolean checkIfRatePlanPresent(String hotelId, String ratePlanId);

	public boolean checkIfStartDateAndDateAreValid(LocalDate startDateOfReservation, LocalDate endDateOfReservation);

	public boolean checkForDuplicateReservation(int reservationId);
	
	public ReservationEntity postReservation(ReservationEntity reservation) throws ReservationAlreadyExist;

	

	

}
