package com.cognizant.usecase5.carservice.entity;

import java.sql.Timestamp;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Car {

	@Id
	@GeneratedValue
	private long id;
	private String carMaker;
	private String modelName;
	private String regNumber;
	private Long chasisNUmber;
	private String knownIssues;
	private Long cost;
	private Timestamp givenDate;
	private LocalDate expectedDeliveryDate;
	private Timestamp createdDateNTime;
	private Timestamp updatedDateNTime;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	
	private long phoneNumber;

	
	//no arg constructor
		public Car() {
			super();
			// TODO Auto-generated constructor stub
		}
	
	//Parameterized Constructor
	public Car(long id, String carMaker, String modelName, String regNumber, Long chasisNUmber, String knownIssues,
			Long cost, Timestamp givenDate, LocalDate expectedDeliveryDate, Timestamp createdDateNTime,
			Timestamp updatedDateNTime, Address address, long phoneNumber) {
		super();
		this.id = id;
		this.carMaker = carMaker;
		this.modelName = modelName;
		this.regNumber = regNumber;
		this.chasisNUmber = chasisNUmber;
		this.knownIssues = knownIssues;
		this.cost = cost;
		this.givenDate = givenDate;
		this.expectedDeliveryDate = expectedDeliveryDate;
		this.createdDateNTime = createdDateNTime;
		this.updatedDateNTime = updatedDateNTime;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	
	
	//getters-setters method

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCarMaker() {
		return carMaker;
	}

	public void setCarMaker(String carMaker) {
		this.carMaker = carMaker;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public Long getChasisNUmber() {
		return chasisNUmber;
	}

	public void setChasisNUmber(Long chasisNUmber) {
		this.chasisNUmber = chasisNUmber;
	}

	public String getKnownIssues() {
		return knownIssues;
	}

	public void setKnownIssues(String knownIssues) {
		this.knownIssues = knownIssues;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Timestamp getGivenDate() {
		return givenDate;
	}

	public void setGivenDate(Timestamp givenDate) {
		this.givenDate = givenDate;
	}

	public LocalDate getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}

	public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}

	public Timestamp getCreatedDateNTime() {
		return createdDateNTime;
	}

	public void setCreatedDateNTime(Timestamp createdDateNTime) {
		this.createdDateNTime = createdDateNTime;
	}

	public Timestamp getUpdatedDateNTime() {
		return updatedDateNTime;
	}

	public void setUpdatedDateNTime(Timestamp updatedDateNTime) {
		this.updatedDateNTime = updatedDateNTime;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	//toString Method
	@Override
	public String toString() {
		return "Car [id=" + id + ", carMaker=" + carMaker + ", modelName=" + modelName + ", regNumber=" + regNumber
				+ ", chasisNUmber=" + chasisNUmber + ", knownIssues=" + knownIssues + ", cost=" + cost + ", givenDate="
				+ givenDate + ", expectedDeliveryDate=" + expectedDeliveryDate + ", createdDateNTime="
				+ createdDateNTime + ", updatedDateNTime=" + updatedDateNTime + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	

}
