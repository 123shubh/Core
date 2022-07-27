package com.org.dto;

import java.io.Serializable;


public class RatesDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int rateId;

	private String rateName;

	private String rateDetails;

	private int referencedRoomId;

	private double ratePerNight;

	public RatesDTO(int rateId, String rateName, String rateDetails, int referencedRoomId, double ratePerNight) {
		super();
		this.rateId = rateId;
		this.rateName = rateName;
		this.rateDetails = rateDetails;
		this.referencedRoomId = referencedRoomId;
		this.ratePerNight = ratePerNight;
	}

	public RatesDTO() {
		super();
	}

	public int getRateId() {
		return rateId;
	}

	public void setRateId(int rateId) {
		this.rateId = rateId;
	}

	public String getRateName() {
		return rateName;
	}

	public void setRateName(String rateName) {
		this.rateName = rateName;
	}

	public String getRateDetails() {
		return rateDetails;
	}

	public void setRateDetails(String rateDetails) {
		this.rateDetails = rateDetails;
	}

	public int getReferencedRoomId() {
		return referencedRoomId;
	}

	public void setReferencedRoomId(int referencedRoomId) {
		this.referencedRoomId = referencedRoomId;
	}

	public double getRatePerNight() {
		return ratePerNight;
	}

	public void setRatePerNight(double ratePerNight) {
		this.ratePerNight = ratePerNight;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RatesDTO [rateId=" + rateId + ", rateName=" + rateName + ", rateDetails=" + rateDetails
				+ ", referencedRoomId=" + referencedRoomId + ", ratePerNight=" + ratePerNight + "]";
	}

}
