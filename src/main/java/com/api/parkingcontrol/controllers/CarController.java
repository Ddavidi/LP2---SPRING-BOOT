/*
 * DAVID NUNES RIBEIRO
 * INF3 - 2022
 */

package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.dtos.CarDto;
import com.api.parkingcontrol.models.CarModel;
import com.api.parkingcontrol.services.CarService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/car")
public class CarController {

    final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<Object> saveCar(@RequestBody @Valid CarDto carDto){
        var carModel = new CarModel();
        BeanUtils.copyProperties(carDto, carModel);
        carModel.setRegistrationDate((LocalDateTime.now(ZoneId.of("UTC"))));
        return ResponseEntity.status(HttpStatus.CREATED).body(carService.save(carModel));
    }
}
