package com.org.entiry;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Rooms implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int roomId;

	private String roomName;

	private String roomDetails;

	@ManyToOne
	@JoinColumn(name = "referenced_hotel_id", referencedColumnName = "referenced_hotel_id")
	private Hotels hotel;

	private boolean isRoomAvailable;

	@Column(name = "referenced_room_id")
	private int referencedRoomId;

	@OneToMany(mappedBy = "rooms")
	private List<Rates> rates;

	public Rooms() {
		super();
	}

	public Rooms(int roomId, String roomName, String roomDetails, Hotels hotel, boolean isRoomAvailable,
			int referencedRoomId, List<Rates> rates) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.roomDetails = roomDetails;
		this.hotel = hotel;
		this.isRoomAvailable = isRoomAvailable;
		this.referencedRoomId = referencedRoomId;
		this.rates = rates;
	}
	
	

	public Rooms(int roomId, String roomName, String roomDetails, Hotels hotel, boolean isRoomAvailable,
			int referencedRoomId) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.roomDetails = roomDetails;
		this.hotel = hotel;
		this.isRoomAvailable = isRoomAvailable;
		this.referencedRoomId = referencedRoomId;
	}

	public Rooms(int roomId2, String roomName2, String roomDetails2, Hotels newHotel, boolean roomAvailable) {
		super();
		this.roomId = roomId2;
		this.roomName = roomName2;
		this.roomDetails = roomDetails2;
		this.hotel = newHotel;
		this.isRoomAvailable = roomAvailable;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomDetails() {
		return roomDetails;
	}

	public void setRoomDetails(String roomDetails) {
		this.roomDetails = roomDetails;
	}

	
	public Hotels getHotel() {
		return hotel;
	}

	public void setHotel(Hotels hotel) {
		this.hotel = hotel;
	}

	public boolean isRoomAvailable() {
		return isRoomAvailable;
	}

	public void setRoomAvailable(boolean isRoomAvailable) {
		this.isRoomAvailable = isRoomAvailable;
	}

	public int getReferencedRoomId() {
		return referencedRoomId;
	}

	public void setReferencedRoomId(int referencedRoomId) {
		this.referencedRoomId = referencedRoomId;
	}

	public List<Rates> getRates() {
		return rates;
	}

	public void setRates(List<Rates> rates) {
		this.rates = rates;
	}

	@Override
	public String toString() {
		return "Rooms [roomId=" + roomId + ", roomName=" + roomName + ", roomDetails=" + roomDetails + ", hotel="
				+ hotel + ", isRoomAvailable=" + isRoomAvailable + ", referencedRoomId=" + referencedRoomId + ", rates="
				+ rates + "]";
	}

}
