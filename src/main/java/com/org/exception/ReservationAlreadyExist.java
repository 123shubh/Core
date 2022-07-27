package com.org.exception;

public class ReservationAlreadyExist extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8533717888294616985L;

	private int resId;
	
	public ReservationAlreadyExist(String msg,int reservatioId) {
		super(msg);
		this.resId=reservatioId;
	}

	public int getResId() {
		return resId;
	}

	public void setResId(int resId) {
		this.resId = resId;
	}
	
	
	
}




