package com.org.entiry;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hotels implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int hotelId;

	private String hotelName;

	private String hotelCity;

	private String hotelAddress;

	@Column(name = "referenced_hotel_id", nullable = false)
	private int referencedHotelId;

	@OneToMany(mappedBy = "hotel")
	private List<Rooms> rooms;

	private int totalNumberOfRooms;

	private int numberOfAvailableRooms;

	public Hotels() {
		super();
	}

	public Hotels(int hotelId, String hotelName, String hotelCity, String hotelAddress, int referencedHotelId,
			List<Rooms> rooms, int totalNumberOfRooms, int numberOfAvailableRooms) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.hotelAddress = hotelAddress;
		this.referencedHotelId = referencedHotelId;
		this.rooms = rooms;
		this.totalNumberOfRooms = totalNumberOfRooms;
		this.numberOfAvailableRooms = numberOfAvailableRooms;
	}
	
	

	public Hotels(int hotelId, String hotelName, String hotelCity, String hotelAddress, int referencedHotelId,
			int totalNumberOfRooms, int numberOfAvailableRooms) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.hotelAddress = hotelAddress;
		this.referencedHotelId = referencedHotelId;
		this.totalNumberOfRooms = totalNumberOfRooms;
		this.numberOfAvailableRooms = numberOfAvailableRooms;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public int getReferencedHotelId() {
		return referencedHotelId;
	}

	public void setReferencedHotelId(int referencedHotelId) {
		this.referencedHotelId = referencedHotelId;
	}

	public List<Rooms> getRooms() {
		return rooms;
	}

	public void setRooms(List<Rooms> rooms) {
		this.rooms = rooms;
	}

	public int getTotalNumberOfRooms() {
		return totalNumberOfRooms;
	}

	public void setTotalNumberOfRooms(int totalNumberOfRooms) {
		this.totalNumberOfRooms = totalNumberOfRooms;
	}

	public int getNumberOfAvailableRooms() {
		return numberOfAvailableRooms;
	}

	public void setNumberOfAvailableRooms(int numberOfAvailableRooms) {
		this.numberOfAvailableRooms = numberOfAvailableRooms;
	}

	@Override
	public String toString() {
		return "Hotels [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelCity=" + hotelCity
				+ ", hotelAddress=" + hotelAddress + ", referencedHotelId=" + referencedHotelId + ", rooms=" + rooms
				+ ", totalNumberOfRooms=" + totalNumberOfRooms + ", numberOfAvailableRooms=" + numberOfAvailableRooms
				+ "]";
	}

}