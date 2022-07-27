
package com.org.entiry;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rates implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int rateId;

	private String rateName;

	private String rateDetails;

	
	private Rooms rooms;
	
	private double ratePerNight;

	public Rates() {
		super();
	}

	public Rates(int rateId, String rateName, String rateDetails, Rooms rooms, double ratePerNight) {
		super();
		this.rateId = rateId;
		this.rateName = rateName;
		this.rateDetails = rateDetails;
		this.rooms = rooms;
		this.ratePerNight = ratePerNight;
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

	@ManyToOne
	@JoinColumn(name = "referenced_room_id", referencedColumnName = "referenced_room_id")
	public Rooms getRooms() {
		return rooms;
	}

	public void setRooms(Rooms rooms) {
		this.rooms = rooms;
	}

	public double getRatePerNight() {
		return ratePerNight;
	}

	public void setRatePerNight(double ratePerNight) {
		this.ratePerNight = ratePerNight;
	}

	@Override
	public String toString() {
		return "Rates [rateId=" + rateId + ", rateName=" + rateName + ", rateDetails=" + rateDetails + ", rooms="
				+ rooms + ", ratePerNight=" + ratePerNight + "]";
	}

}
