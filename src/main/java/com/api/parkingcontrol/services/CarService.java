/*
 * DAVID NUNES RIBEIRO
 * INF3 - 2020
 */

package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.repositories.CarRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CarService {

    final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Transactional
    public CarModel save(CarModel carModel) {
        return carRepository.save(carModel);
    }
}
