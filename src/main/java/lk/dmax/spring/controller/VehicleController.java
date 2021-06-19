package lk.dmax.spring.controller;


import lk.dmax.spring.dto.CustomerDTO;
import lk.dmax.spring.dto.DriverDTO;
import lk.dmax.spring.dto.VehicleDTO;
import lk.dmax.spring.exception.NotFoundException;
import lk.dmax.spring.repo.DriverRepo;
import lk.dmax.spring.repo.VehicleRepo;
import lk.dmax.spring.service.CustomerService;
import lk.dmax.spring.service.VehicleService;
import lk.dmax.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @Autowired
    VehicleRepo vehicleRepo;

    @Autowired
    DriverRepo driverRepo;

    @PostMapping(path="save",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveVehicle(@RequestBody VehicleDTO vehicleDTO){
//        String vehicleNo = vehicleDTO.getVehicleNo();
//        String brand = vehicleDTO.getBrand();
//        String fuelType = vehicleDTO.getFuelType();
//        int noOfPassenger = vehicleDTO.getNoOfPassenger();
//        String transmissionType = vehicleDTO.getTransmissionType();
//        String type = vehicleDTO.getType();
        System.out.println("000000000");
        ArrayList<DriverDTO> availableDrivers = driverRepo.getAvailableDrivers();
        System.out.println("1111111111");
        for (DriverDTO dto:availableDrivers) {
            System.out.println("22222222");
            System.out.println(dto.toString());
        }
        if (vehicleDTO.getVehicleNo().trim().length() <= 0) {
            throw new NotFoundException("Vehicle No cannot be empty");
        }
        vehicleService.saveVehicle(vehicleDTO);
        return new ResponseEntity(new StandradResponse("201", "Done", vehicleDTO), HttpStatus.CREATED);
    }

    @PutMapping(path = "update",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateVehicle(@RequestBody VehicleDTO vehicleDTO) {
        if (vehicleDTO.getVehicleNo().trim().length() <= 0) {
            throw new NotFoundException("No Vehicle provided to update");
        }
        vehicleService.updateVehicle(vehicleDTO);
        return new ResponseEntity(new StandradResponse("200", "Done", vehicleDTO), HttpStatus.OK);
    }
}
