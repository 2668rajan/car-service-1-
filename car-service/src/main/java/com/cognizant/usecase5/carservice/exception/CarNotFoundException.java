package com.cognizant.usecase5.carservice.exception;

public class CarNotFoundException extends Exception{

	private static final long serialVersionUID = 1l;
	
	public CarNotFoundException() {
		super();
	}
	
	public CarNotFoundException(String message) {
		super(message);
	}

}
