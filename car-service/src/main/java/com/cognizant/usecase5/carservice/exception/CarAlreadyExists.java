package com.cognizant.usecase5.carservice.exception;

public class CarAlreadyExists extends Exception{
	
	private static final long serialVersionUID = 1l;
	
	public CarAlreadyExists() {
		super();
	}
	
	public CarAlreadyExists(String message) {
		super(message);
	}

}
