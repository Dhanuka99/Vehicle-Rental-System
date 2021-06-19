package lk.dmax.spring.controller;

import lk.dmax.spring.dto.BookingDTO;
import lk.dmax.spring.dto.DriverDTO;
import lk.dmax.spring.dto.VehicleDTO;
import lk.dmax.spring.repo.BookingRepo;
import lk.dmax.spring.repo.DriverRepo;
import lk.dmax.spring.repo.VehicleRepo;
import lk.dmax.spring.service.BookingService;
import lk.dmax.spring.service.DriverService;
import lk.dmax.spring.service.VehicleService;
import lk.dmax.spring.util.StandradResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/booking")
public class BookingController {

    @Autowired
    BookingRepo bookingRepo;
        @Autowired
        DriverRepo driverRepo;
        @Autowired
        VehicleRepo vehicleRepo;
        @Autowired
        VehicleService vehicleService;
        @Autowired
        DriverService driverService;
        @Autowired
        ModelMapper modelMapper;
        @Autowired
        BookingService bookingService;

    @GetMapping(path = "availableDrivers",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllCustomers() {
        ArrayList<DriverDTO> allCustomers = driverRepo.getAvailableDrivers();
        return new ResponseEntity(new StandradResponse("200", "Done", allCustomers), HttpStatus.OK);
    }

    @PostMapping(path = "placeBooking",produces = MediaType.APPLICATION_JSON_VALUE)
    public void placeBooking(@RequestBody BookingDTO bookingDTO){
        ArrayList<String> driverNicList = bookingDTO.getDriverNicList();
        ArrayList<String> vehiclesNoList = bookingDTO.getVehiclesNoList();
        String customerNic = bookingDTO.getCustomerNic();
        String bookingDate = bookingDTO.getBookingDate();
        String bookingTime = bookingDTO.getBookingTime();
        String returnDate = bookingDTO.getReturnDate();
        String returnTime = bookingDTO.getReturnTime();

        DriverDTO driverDTO = null;
        VehicleDTO vehicleDTO = null;

        for (String id:driverNicList) {
            driverDTO = driverService.searchDriver(id);
            driverDTO.setDriverStatus(1);
            driverService.updateDriver(driverDTO);
            System.out.println(driverDTO.toString());
        }
        for (String id:vehiclesNoList) {
            vehicleDTO = vehicleService.searchVehicle(id);
            vehicleDTO.setVehicleStatus(1);
            vehicleService.updateVehicle(vehicleDTO);
            System.out.println(vehicleDTO.toString());
        }


        bookingDTO.setBookingStatus(1);
        int bookingStatus = bookingDTO.getBookingStatus();

        // bookingService.saveBooking(new BookingDTO(lastid,));
//public BookingDTO(String bookingDate, String bookingTime, String returnDate, String returnTime, String paymentStatus, String customerNic, ArrayList<String> vehiclesNoList, ArrayList<String> driverNicList) {
        bookingService.saveBooking(new BookingDTO(bookingDate,bookingTime,returnDate,returnTime,bookingStatus,customerNic,vehiclesNoList,driverNicList));
    }

}
