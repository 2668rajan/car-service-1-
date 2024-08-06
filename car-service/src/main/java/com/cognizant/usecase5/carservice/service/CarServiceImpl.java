package com.cognizant.usecase5.carservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.usecase5.carservice.dao.CarDao;
import com.cognizant.usecase5.carservice.entity.Car;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDao carDao;


	@Override
	public List<Car> getAllCars() {
		List<Car> cars = carDao.findAll();
		return cars;
	}

	@Override
	public Car getCar(long parseLong) {
		Car car = carDao.findAllById(parseLong);
		return car;
	}

	@Override
	public Car addCar(Car car) {
		Car save = carDao.save(car);
		return save;
	}

	@Override
	public Car updateCar(Car car) {
		Car save = carDao.save(car);
		return save;
	}

	@Override
	public void deleteCar(long parseLong) {

		carDao.deleteById(parseLong);
	}

	@Override
	public boolean carExist(long id) {
		
		return carDao.existsById(id);
	}

	@Override
	public boolean carExistByChasisNumber(Long chasisNUmber) {
		return carDao.existsById(chasisNUmber);
	}

	@Override
	public boolean carExistByRegNumber(String regNumber) {
		return carDao.existsByRegNumber(regNumber);
	}

	

}
