package com.org.dto;

public class HotelsDTO {

	private int hotelId;

	private String hotelName;

	private String hotelCity;

	private String hotelAddress;

	private int referencedHotelId;

	private int totalNumberOfRooms;

	private int numberOfAvailableRooms;

	public HotelsDTO() {
		super();
	}

	public HotelsDTO(int hotelId, String hotelName, String hotelCity, String hotelAddress, int referencedHotelId,
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
		return "HotelsDTO [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelCity=" + hotelCity
				+ ", hotelAddress=" + hotelAddress + ", referencedHotelId=" + referencedHotelId
				+ ", totalNumberOfRooms=" + totalNumberOfRooms + ", numberOfAvailableRooms=" + numberOfAvailableRooms
				+ "]";
	}

}
