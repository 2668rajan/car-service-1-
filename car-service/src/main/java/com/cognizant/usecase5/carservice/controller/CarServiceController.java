package com.cognizant.usecase5.carservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.usecase5.carservice.entity.Car;
import com.cognizant.usecase5.carservice.exception.CarAlreadyExists;
import com.cognizant.usecase5.carservice.exception.CarNotFoundException;
import com.cognizant.usecase5.carservice.service.CarService;

@RestController
@RequestMapping("/car")
public class CarServiceController {

	@Autowired
	private CarService carService;

	@GetMapping("/home")
	public String home() {
		return "Welcome Home Page";
	}

	// getting all cars
	@GetMapping("/cars")
	public ResponseEntity<List> getAllCars() throws CarNotFoundException {
		
		List<Car> cars = carService.getAllCars();
		
		if (cars.isEmpty()) {
			
			throw new CarNotFoundException("Car Not Found");
		}
		return new ResponseEntity<>(cars, HttpStatus.OK);

	}

	// getting a car
	@GetMapping("/cars/{id}")
	public ResponseEntity<Car> getCar(@PathVariable String id) throws CarNotFoundException {

		if (carService.carExist(Long.parseLong(id))) {
			
			Car car = carService.getCar(Long.parseLong(id));
			
			return new ResponseEntity<>(car, HttpStatus.OK);			
		} else {
			
			throw new CarNotFoundException("Car not found");
		}
	}

	// adding a car
	@PostMapping("/cars")
	public ResponseEntity<String> addCar(@RequestBody Car car) throws CarAlreadyExists {


		if (carService.carExistByRegNumber(car.getRegNumber())) {
			throw new CarAlreadyExists("car with registration number " + car.getRegNumber() + " already exists");
		} else {
			if (carService.carExistByChasisNumber(car.getChasisNUmber())) {
				throw new CarAlreadyExists("car with " + car.getChasisNUmber() + " already exists");
			}
		}

		carService.addCar(car);

		return new ResponseEntity<>("Car updated successfully", HttpStatus.CREATED);
	}

	// updating a car
	@PutMapping("cars/{id}")
	public ResponseEntity<Car> updateCar(@RequestBody Car car, @PathVariable Long id)
			throws CarNotFoundException, CarAlreadyExists {

		if (carService.carExist(id)) {

			if (carService.carExistByRegNumber(car.getRegNumber())) {
				throw new CarAlreadyExists("car with registration number " + car.getRegNumber() + " already exists");
			} else {
				if (carService.carExistByChasisNumber(car.getChasisNUmber())) {
					throw new CarAlreadyExists("car with " + car.getChasisNUmber() + " already exists");
				}
			}

			carService.updateCar(car);

			return new ResponseEntity<>(car, HttpStatus.CREATED);

		} else {
			throw new CarNotFoundException("Car not found");
		}
	}

	// deleting a car
	@DeleteMapping("/cars/{id}")
	public ResponseEntity<String> Car(@PathVariable String id) throws CarNotFoundException {

		if (carService.carExist(Long.parseLong(id))) {
			try {
				this.carService.deleteCar(Long.parseLong(id));
				return new ResponseEntity<>("Car with " + id + " deleted successfully", HttpStatus.ACCEPTED);

			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		} else {
			throw new CarNotFoundException("Car not found");
		}
	}

}
