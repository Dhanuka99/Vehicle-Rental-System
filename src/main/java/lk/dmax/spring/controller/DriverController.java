package lk.dmax.spring.controller;

import lk.dmax.spring.dto.DriverDTO;
import lk.dmax.spring.MtoM.Driver;
import lk.dmax.spring.exception.NotFoundException;
import lk.dmax.spring.repo.DriverRepo;
import lk.dmax.spring.service.DriverService;
import lk.dmax.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/driver")
public class DriverController {

    @Autowired
    DriverService driverService;

    @Autowired
    DriverRepo driverRepo;

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



    @GetMapping(path = "availableDrivers",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllCustomers() {
       // ArrayList<Driver> allCustomers = driverRepo.getAvailableDrivers();
       // System.out.println(allCustomers.toString());
       // return new ResponseEntity(new StandradResponse("200", "Done", allCustomers), HttpStatus.OK);
   return null;
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteDriver(@RequestParam String id){

        driverService.deleteDriver(id);
        return new ResponseEntity(new StandradResponse("200","Done",null),HttpStatus.OK);
    }


    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity searchDriver(@PathVariable String id){
        DriverDTO driverDTO = driverService.searchDriver(id);
        return new ResponseEntity(new StandradResponse("200","Done",driverDTO),HttpStatus.OK);
    }


}
