package com.cognizant.usecase5.carservice.service;

import java.util.List;

import com.cognizant.usecase5.carservice.entity.Car;

public interface CarService {

	List<Car> getAllCars();

	Car getCar(long parseLong);

	Car addCar(Car car);

	Car updateCar(Car car);

	void deleteCar(long parseLong);

	boolean carExist(long l);

	boolean carExistByChasisNumber(Long chasisNUmber);

	boolean carExistByRegNumber(String regNumber);

}
