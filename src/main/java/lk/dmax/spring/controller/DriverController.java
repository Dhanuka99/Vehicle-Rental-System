package lk.dmax.spring.controller;

import lk.dmax.spring.dto.CustomerDTO;
import lk.dmax.spring.dto.DriverDTO;
import lk.dmax.spring.exception.NotFoundException;
import lk.dmax.spring.service.CustomerService;
import lk.dmax.spring.service.DriverService;
import lk.dmax.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/driver")
public class DriverController {

    @Autowired
    DriverService driverService;

    @PostMapping(path="save",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveDriver(@RequestBody DriverDTO driverDTO){
        if (driverDTO.getDriverNic().trim().length() <= 0) {
            throw new NotFoundException("Driver id cannot be empty");
        }
        driverService.saveDriver(driverDTO);
        return new ResponseEntity(new StandradResponse("201", "Done", driverDTO), HttpStatus.CREATED);
    }

    @PutMapping(path = "update",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateDriver(@RequestBody DriverDTO driverDTO) {
        if (driverDTO.getDriverNic().trim().length() <= 0) {
            throw new NotFoundException("No id provided to update");
        }
        driverService.updateDriver(driverDTO);
        return new ResponseEntity(new StandradResponse("200", "Done", driverDTO), HttpStatus.OK);
    }
}
