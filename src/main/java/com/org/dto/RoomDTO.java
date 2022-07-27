package com.org.dto;

public class RoomDTO {

	private int roomId;

	private String roomName;

	private String roomDetails;

	private int referenceHotelId;

	private boolean isRoomAvailable;

	private int referencedRoomId;

	public RoomDTO() {
		super();
	}

	public RoomDTO(int roomId, String roomName, String roomDetails, int referenceHotelId, boolean isRoomAvailable,
			int referencedRoomId) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.roomDetails = roomDetails;
		this.referenceHotelId = referenceHotelId;
		this.isRoomAvailable = isRoomAvailable;
		this.referencedRoomId = referencedRoomId;
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

	public int getReferenceHotelId() {
		return referenceHotelId;
	}

	public void setReferenceHotelId(int referenceHotelId) {
		this.referenceHotelId = referenceHotelId;
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

	@Override
	public String toString() {
		return "RoomDTO [roomId=" + roomId + ", roomName=" + roomName + ", roomDetails=" + roomDetails
				+ ", referenceHotelId=" + referenceHotelId + ", isRoomAvailable=" + isRoomAvailable + "]";
	}

}
