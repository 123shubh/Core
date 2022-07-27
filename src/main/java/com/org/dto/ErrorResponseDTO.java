package com.org.dto;

public class ErrorResponseDTO {

	private int errorCode;

	private String ErrorName;

	private String ErrorMessage;

	private int reservationId;

	public ErrorResponseDTO() {
		super();
	}

	public ErrorResponseDTO(int errorCode, String errorName, String errorMessage) {
		super();
		this.errorCode = errorCode;
		ErrorName = errorName;
		ErrorMessage = errorMessage;
	}

	public ErrorResponseDTO(int errorCode, String errorName, String errorMessage, int reservationId) {
		super();
		this.errorCode = errorCode;
		ErrorName = errorName;
		ErrorMessage = errorMessage;
		this.reservationId = reservationId;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorName() {
		return ErrorName;
	}

	public void setErrorName(String errorName) {
		ErrorName = errorName;
	}

	public String getErrorMessage() {
		return ErrorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	@Override
	public String toString() {
		return "ErrorResponseDTO [errorCode=" + errorCode + ", ErrorName=" + ErrorName + ", ErrorMessage="
				+ ErrorMessage + ", reservationId=" + reservationId + "]";
	}

}
