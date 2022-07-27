package com.org.entiry;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ReservationEntity {
	
	@Id
	private int reservationId;
	
	private String resStatus;
	
	private String firstNameOfReservor;
	
	private String lastNameOfReservor;
	
	private LocalDate dateFfReservationCreated;
	
	private LocalDate startDateOfReservation;
	
	private LocalDate endDateOfReservation;
	
	private String hotelId;
	
	private String hotelName;
	
	private int numberOfGuest;
	
	private int numberOfRooms;
	
	private String RoomId;
	
	private String roomName;
	
	private String ratePlanId;
	
	private String ratePlanName;
	
	private double totalAmount;

	public ReservationEntity() {
		super();
	}

	public ReservationEntity(int reservationId, String resStatus, String firstNameOfReservor, String lastNameOfReservor,
			LocalDate dateFfReservationCreated, LocalDate startDateOfReservation, LocalDate endDateOfReservation,
			String hotelId, String hotelName, int numberOfGuest, int numberOfRooms, String roomId, String roomName,
			String ratePlanId, String ratePlanName, double totalAmount) {
		super();
		this.reservationId = reservationId;
		this.resStatus = resStatus;
		this.firstNameOfReservor = firstNameOfReservor;
		this.lastNameOfReservor = lastNameOfReservor;
		this.dateFfReservationCreated = dateFfReservationCreated;
		this.startDateOfReservation = startDateOfReservation;
		this.endDateOfReservation = endDateOfReservation;
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.numberOfGuest = numberOfGuest;
		this.numberOfRooms = numberOfRooms;
		RoomId = roomId;
		this.roomName = roomName;
		this.ratePlanId = ratePlanId;
		this.ratePlanName = ratePlanName;
		this.totalAmount = totalAmount;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public String getResStatus() {
		return resStatus;
	}

	public void setResStatus(String resStatus) {
		this.resStatus = resStatus;
	}

	public String getFirstNameOfReservor() {
		return firstNameOfReservor;
	}

	public void setFirstNameOfReservor(String firstNameOfReservor) {
		this.firstNameOfReservor = firstNameOfReservor;
	}

	public String getLastNameOfReservor() {
		return lastNameOfReservor;
	}

	public void setLastNameOfReservor(String lastNameOfReservor) {
		this.lastNameOfReservor = lastNameOfReservor;
	}

	public LocalDate getDateFfReservationCreated() {
		return dateFfReservationCreated;
	}

	public void setDateFfReservationCreated(LocalDate dateFfReservationCreated) {
		this.dateFfReservationCreated = dateFfReservationCreated;
	}

	public LocalDate getStartDateOfReservation() {
		return startDateOfReservation;
	}

	public void setStartDateOfReservation(LocalDate startDateOfReservation) {
		this.startDateOfReservation = startDateOfReservation;
	}

	public LocalDate getEndDateOfReservation() {
		return endDateOfReservation;
	}

	public void setEndDateOfReservation(LocalDate endDateOfReservation) {
		this.endDateOfReservation = endDateOfReservation;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getNumberOfGuest() {
		return numberOfGuest;
	}

	public void setNumberOfGuest(int numberOfGuest) {
		this.numberOfGuest = numberOfGuest;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getRoomId() {
		return RoomId;
	}

	public void setRoomId(String roomId) {
		RoomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRatePlanId() {
		return ratePlanId;
	}

	public void setRatePlanId(String ratePlanId) {
		this.ratePlanId = ratePlanId;
	}

	public String getRatePlanName() {
		return ratePlanName;
	}

	public void setRatePlanName(String ratePlanName) {
		this.ratePlanName = ratePlanName;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "ReservationEntity [reservationId=" + reservationId + ", resStatus=" + resStatus
				+ ", firstNameOfReservor=" + firstNameOfReservor + ", lastNameOfReservor=" + lastNameOfReservor
				+ ", dateFfReservationCreated=" + dateFfReservationCreated + ", startDateOfReservation="
				+ startDateOfReservation + ", endDateOfReservation=" + endDateOfReservation + ", hotelId=" + hotelId
				+ ", hotelName=" + hotelName + ", numberOfGuest=" + numberOfGuest + ", numberOfRooms=" + numberOfRooms
				+ ", RoomId=" + RoomId + ", roomName=" + roomName + ", ratePlanId=" + ratePlanId + ", ratePlanName="
				+ ratePlanName + ", totalAmount=" + totalAmount + "]";
	}

	
	

	
	

}
