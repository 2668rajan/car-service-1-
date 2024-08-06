package com.cognizant.usecase5.carservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.usecase5.carservice.entity.Car;

public interface CarDao extends JpaRepository<Car, Long>{

	Car findAllById(long parseLong);

	boolean existsByRegNumber(String regNumber);

}
