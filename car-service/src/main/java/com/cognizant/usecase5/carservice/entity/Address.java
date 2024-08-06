package com.cognizant.usecase5.carservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int houseNo;

	private String street;
	private String Landmark;
	private String City;
	private String State;
	private Long pin;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int houseNo, String street, String landmark, String city, String state, Long pin) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		Landmark = landmark;
		City = city;
		State = state;
		this.pin = pin;
	}

	//getters and setters
	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLandmark() {
		return Landmark;
	}

	public void setLandmark(String landmark) {
		Landmark = landmark;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Long getPin() {
		return pin;
	}

	public void setPin(Long pin) {
		this.pin = pin;
	}
	
	//toString method

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", Landmark=" + Landmark + ", City=" + City
				+ ", State=" + State + ", pin=" + pin + "]";
	}
	
	

}
